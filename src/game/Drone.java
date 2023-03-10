package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Drone extends DynamicBody implements ActionListener{

    private static final Shape droneShape = new CircleShape(0.5f);

    private static final String deathImage = "data/sprites/drone/drone-death.gif";
    private static final String attackRightImage = "data/sprites/drone/drone-attack-right.gif";
    private static final String attackLeftImage = "data/sprites/drone/drone-attack-left.gif";

    private final Timer shotTimer;
    public Drone(World w) {
        super(w, droneShape);
        shotTimer = new Timer(5000, this);
        shotTimer.setInitialDelay(5000);
        shotTimer.start();

        this.SwapImage("idle");

        this.setGravityScale(0);
    }

    public void BulletPreparation() {

        Student currentStudent = Game.getLevelManager().currentStudent;
        double angle = this.GetDifference(currentStudent.getPosition(), this.getPosition());
        setAngle((float) angle);

       SwapImage("attack-right");
        Timer bulletTimer = new Timer(200, new ProjectileRelease(this, angle));
        bulletTimer.setInitialDelay(0);
        bulletTimer.start();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        BulletPreparation();
    }

    public double GetDifference(Vec2 studentPos, Vec2 currentPos) {
        double deltaY = studentPos.y - currentPos.y;
        double deltaX = studentPos.x - currentPos.x;
        return Math.atan2(deltaY, deltaX);
    }

    public void Crash() {
        removeAllImages();
        addImage(new BodyImage(deathImage, 3));
        setGravityScale(10);
        applyForce(new Vec2((float) (Math.random() * 20 - 10), 0f));
        shotTimer.removeActionListener(this);
        shotTimer.stop();
    }

    public void SwapImage(String imageType) {
        this.removeAllImages();
        switch (imageType) {
            case "death" -> this.addImage(new BodyImage(deathImage, 3));
            case "idle" -> this.addImage(new BodyImage("data/sprites/drone/drone-idle.gif", 3));
            case "attack-left" -> this.addImage(new BodyImage(attackLeftImage, 3));
            case "attack-right" -> this.addImage(new BodyImage(attackRightImage, 3));
        }
    }
}

class ProjectileRelease implements ActionListener {
    private final Drone sourceDrone;
    private final double angle;

    public ProjectileRelease(Drone sourceDrone, double angle) {
        this.sourceDrone = sourceDrone;
        this.angle = angle;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        DynamicBody projectile = new DynamicBody(sourceDrone.getWorld(), new BoxShape(0.25f, 1f));

        BodyImage bullet = new BodyImage("data/img/lasers/dronelaser.png");
        AttachedImage bulletImage = new AttachedImage(projectile, bullet, 3F, 0, new Vec2());
        ProjectileImpact impact = new ProjectileImpact();
        projectile.addCollisionListener(impact);
        projectile.setGravityScale(0f);
        projectile.setPosition(new Vec2((float) (2 * Math.cos(angle)), (float) (2 * Math.sin(angle))));
        projectile.setAngle((float) (angle + Math.PI / 2));
        projectile.setLinearVelocity(new Vec2((float) Math.cos(angle) * 20, (float) Math.sin(angle) * 20));
        System.out.println("vel: " + projectile.getLinearVelocity() + " angle: " + angle);
        sourceDrone.SwapImage("idle");

        Timer timer = (Timer) e.getSource();
        timer.stop();
    }
}

