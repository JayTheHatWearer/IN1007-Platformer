package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Drone extends DynamicBody implements ActionListener{

    private static final Shape droneShape = new CircleShape(0.5f);

    private static final String idleImage = "data/sprites/drone/drone-idle.gif";
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

        if (angle <= (Math.negateExact((long) (Math.PI / 2))) || (angle >= Math.PI / 2)) {
            this.SwapImage("attack-left");
        } else {
            this.SwapImage("attack-left");
        }

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
        shotTimer.stop();
    }

    public void SwapImage(String imageType) {
        switch (imageType) {
            case "death":
                this.addImage(new BodyImage(deathImage, 3));
                break;
            case "idle":
                this.addImage(new BodyImage("data/sprites/drone/drone-idle.gif", 3));
            case "attack-left":
                this.addImage(new BodyImage(attackLeftImage, 3));
                break;
            case "attack-right":
                this.addImage(new BodyImage(attackRightImage, 3));
                break;
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

        DynamicBody projectile = new DynamicBody(sourceDrone.getWorld(), new BoxShape(1f, 0.25f));

        BodyImage bullet = new BodyImage("data/img/lasers/dronelaser.png");
        AttachedImage bulletImage = new AttachedImage(projectile, bullet, 3F, 0, new Vec2());

        ProjectileImpact impact = new ProjectileImpact();
        projectile.addCollisionListener(impact);
        projectile.setGravityScale(0f);
        projectile.setPosition(new Vec2((float) Math.cos(angle), (float) Math.sin(angle)));
        projectile.setAngle((float) ((float) angle + (Math.PI / 2)));
        projectile.setLinearVelocity(new Vec2((float) Math.cos(angle) * 25, (float) Math.sin(angle) * 25));
        System.out.println("vel: " + projectile.getLinearVelocity() + " angle: " + angle);
        sourceDrone.SwapImage("idle");

        Timer timer = (Timer) e.getSource();
        timer.stop();
    }
}

