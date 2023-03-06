package game.levels;

import city.cs.engine.BoxShape;
import city.cs.engine.World;
import game.FinishLine;
import game.Flipper;
import game.Platform;
import game.Student;
import obstacle.CollisonHandler;
import org.jbox2d.common.Vec2;

public class LevelTwo extends World {
    private final Student student;
    public LevelTwo() {
        super();
        //init ground
        Populate();

        //make a character (with an overlaid image)
        student = new Student(this);
        student.setPosition(new Vec2(-9f, 10f));
        student.setReturnPosition(new Vec2(-9f, -9f));
        CollisonHandler obstacleMain = new CollisonHandler(student);
        student.addCollisionListener(obstacleMain);
    }

    private void Populate() {
        Platform groundOne = new Platform(this, new BoxShape(12f, 1f));
        groundOne.setPosition(new Vec2(0f, -12f));

        Platform leftWall = new Platform(this, new BoxShape(1f, 12));
        leftWall.setPosition(new Vec2(-12f, 0f));

        Platform rightWall = new Platform(this, new BoxShape(1f, 14));
        rightWall.setPosition(new Vec2(12f, 0f));

        Platform roofOne = new Platform(this, new BoxShape(12f, 1f));
        roofOne.setPosition(new Vec2(-5f, 12f));

        Platform containerZero = new Platform(this, new BoxShape(2f, 4f));
        containerZero.setPosition(new Vec2(-9f, 4f));

        Platform containerOne = new Platform(this, new BoxShape(3.9f, 3f));
        containerOne.setPosition(new Vec2(-5f, -5.9f));

        Platform containerTwo = new Platform(this, new BoxShape(1.9f, 9.9f));
        containerTwo.setPosition(new Vec2(-3f, 2f));

        Platform containerThree = new Platform(this, new BoxShape(1f, 1f));
        containerThree.setPosition(new Vec2(2f, -10f));

        Platform containerFour = new Platform(this, new BoxShape(1f, 1f));
        containerFour.setPosition(new Vec2(-0.2f, -5f));

        Platform containerSix = new Platform(this, new BoxShape(1f, 1f));
        containerSix.setPosition(new Vec2(2f, 0f));


        Platform containerSeven = new Platform(this, new BoxShape(1f, 1f));
        containerSeven.setPosition(new Vec2(-0.2f, 5f));


        Platform containerFive = new Platform(this, new BoxShape(0.5f, 10f));
        containerFive.setPosition(new Vec2(3.4f, -2f));

        Platform containerEight = new Platform(this, new BoxShape(0.5f, 10f));
        containerEight.setPosition(new Vec2(6.5f, 2f));

        Flipper newFlipper = new Flipper(this);
        newFlipper.setPosition(new Vec2(9f, -6f));

        FinishLine finishLine = new FinishLine(this, new BoxShape(2f, 1f));
        finishLine.setPosition(new Vec2(9f, 12f));
        finishLine.setNextLevel(3);

    }
    public Student getStudent() {
        return student;
    }
}