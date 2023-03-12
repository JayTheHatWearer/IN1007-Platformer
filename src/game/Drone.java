package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Drone extends DynamicBody implements ActionListener {

    private static final Shape droneShape = new CircleShape(0.5f);

    private final Timer shotTimer;
    private final Timer angleTimer;

    private Timer bulletTimer;

    public Drone(World w) {
        super(w, droneShape);
        shotTimer = new Timer(4000, this);
        shotTimer.start();

        angleTimer = new Timer(50, new AngleSetter(this));
        angleTimer.setInitialDelay(50);
        angleTimer.start();

        DroneCollisions droneManager = new DroneCollisions(this);
        addCollisionListener(droneManager);

        addImage(new BodyImage("data/sprites/drone/drone-idle.gif", 3));

        this.setGravityScale(0);
    }

    // Method for preparing to shoot a bullet
    public void BulletPreparation() {
        // Get the current student object and calculate the angle between the student and the drone
        Student currentStudent = Game.getLevelManager().currentStudent;


        removeAllImages();
        addImage(new BodyImage("data/sprites/drone/drone-red.gif", 3));

        bulletTimer = new Timer(1000, new ProjectileRelease(this, currentStudent));
        bulletTimer.start();
    }

    // Method that is called when the timer for shooting bullets is fired
    @Override
    public void actionPerformed(ActionEvent ae) {
        BulletPreparation();
    }


    // Method for calculating the angle between two positions
    public double GetDifference(Vec2 studentPos, Vec2 currentPos) {
        double deltaY = studentPos.y - currentPos.y;
        double deltaX = studentPos.x - currentPos.x;
        return Math.atan2(deltaY, deltaX);
    }

    public void Crash() {
        angleTimer.removeActionListener(angleTimer.getActionListeners()[0]);
        angleTimer.stop();
        shotTimer.removeActionListener(this);
        shotTimer.stop();
        bulletTimer.stop();
        bulletTimer.removeActionListener(bulletTimer.getActionListeners()[0]);
        setGravityScale(10);
        applyForce(new Vec2((float) (Math.random() * 20 - 10), 0f));

    }

    @Override
    public void destroy() {
        angleTimer.stop();
        shotTimer.stop();
        bulletTimer.stop();
        super.destroy();
    }
}


/**
 * An ActionListener that creates and releases a projectile from a Drone.
 */
class ProjectileRelease implements ActionListener {
    // The Drone that is releasing the projectile
    private final Drone sourceDrone;

    private final Student student;

    /**
     * Constructs a new ProjectileRelease.
     * @param sourceDrone The Drone that is releasing the projectile.
     */
    public ProjectileRelease(Drone sourceDrone, Student student) {
        this.sourceDrone = sourceDrone;
        this.student = student;
    }

    /**
     * Called when the ActionListener is triggered.
     * Creates a new projectile and releases it from the Drone.
     * @param e The ActionEvent that triggered this ActionListener.
     */
    @Override
    public void actionPerformed(ActionEvent e) {


        // The angle at which the projectile is being released
        double angle = sourceDrone.GetDifference(student.getPosition(), sourceDrone.getPosition());
        // Create a new DynamicBody for the projectile, with a box shape
        DynamicBody projectile = new DynamicBody(sourceDrone.getWorld(), new BoxShape(0.25f, 1f));

        // Set the BodyImage for the projectile to a laser image
        BodyImage bullet = new BodyImage("data/img/lasers/dronelaser.png");
        new AttachedImage(projectile, bullet, 3F, 0, new Vec2());

        // Create a new ProjectileImpact listener and add it to the projectile
        ProjectileImpact impact = new ProjectileImpact();
        projectile.addCollisionListener(impact);

        // Set the gravity scale for the projectile to 0
        projectile.setGravityScale(0f);

        // Set the initial position and angle of the projectile
        projectile.setPosition(new Vec2((float) (2 * Math.cos(angle)), (float) (2 * Math.sin(angle))));
        projectile.setAngle((float) (angle + Math.PI / 2));

        sourceDrone.setAngle((float) (angle));

        // Set the initial velocity of the projectile in the direction of the angle
        projectile.setLinearVelocity(new Vec2((float) Math.cos(angle) * 15, (float) Math.sin(angle) * 15));

        // Set the Drone's image to "idle"
        sourceDrone.removeAllImages();
        sourceDrone.addImage(new BodyImage("data/sprites/drone/drone-idle.gif", 3));

        // Stop the Timer that triggered this ActionListener
        Timer timer = (Timer) e.getSource();
        timer.stop();

    }
}

class AngleSetter implements ActionListener {

    private final Drone drone;
    public AngleSetter(Drone drone) {
        this.drone = drone;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        drone.setAngle((float) drone.GetDifference(Game.getLevelManager().currentStudent.getPosition(), drone.getPosition()));
    }
}

class DroneCollisions implements CollisionListener {

    private final Drone drone;

    public DroneCollisions(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody() instanceof Student) {
            drone.Crash();
        } else {
            drone.destroy();
        }
    }
}