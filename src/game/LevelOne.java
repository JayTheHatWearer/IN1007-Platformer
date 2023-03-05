package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import obstacle.Obstacle;
import obstacle.CollisonHandler;
import org.jbox2d.common.Vec2;

import java.awt.*;

public class LevelOne extends World {
    private Student student;
    private int checkpointState;
    public LevelOne() {
        super();

        //init ground

        Platform groundOne = new Platform(this, new BoxShape(12f, 1f));
        groundOne.setPosition(new Vec2(-4f, -12f));

        Platform leftWall = new Platform(this, new BoxShape(1f, 12));
        leftWall.setPosition(new Vec2(-12f, 0f));

        Platform roofOne = new Platform(this, new BoxShape(11f, 1f));
        roofOne.setPosition(new Vec2(-2f, 12f));

        Platform containerOne = new Platform(this, new BoxShape(1f, 10f));
        containerOne.setPosition(new Vec2(-6f,-2f));

        Platform containerTwo = new Platform(this, new BoxShape(1f, 10f));
        containerTwo.setPosition(new Vec2(0f,2f));

        Flipper flipperOne = new Flipper(this);
        flipperOne.setPosition(new Vec2(-9f, -6f));

        Flipper flipperTwo = new Flipper(this);
        flipperTwo.setPosition(new Vec2(-3f, 6f));

        //make a character (with an overlaid image)
        student = new Student(this);
        student.setPosition(new Vec2(-9f, -9f));
        student.setReturnPosition(new Vec2(-9f, -9f));
        CollisonHandler obstacleMain = new CollisonHandler(student);
        student.addCollisionListener(obstacleMain);

        FlipperPickup inverter = new FlipperPickup(student);
        student.addCollisionListener(inverter);

    }

    public Student getStudent() {
        return student;
    }
}