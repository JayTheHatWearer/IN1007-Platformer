package game.levels;

import city.cs.engine.BoxShape;
import city.cs.engine.World;
import game.FinishLine;
import game.Platform;
import game.Student;
import obstacle.CollisonHandler;
import org.jbox2d.common.Vec2;

public class LevelOne extends World {
    private final Student student;
    public LevelOne() {
        super();
        //init ground
        Populate();

        //make a character (with an overlaid image)
        student = new Student(this);
        student.setPosition(new Vec2(-9f, -9f));
        student.setReturnPosition(new Vec2(-9f, -9f));
        CollisonHandler obstacleMain = new CollisonHandler(student);
        student.addCollisionListener(obstacleMain);
    }

    private void Populate() {
        Platform groundOne = new Platform(this, new BoxShape(14f, 1f));
        groundOne.setPosition(new Vec2(-7f, -12f));

        Platform leftWall = new Platform(this, new BoxShape(1f, 12));
        leftWall.setPosition(new Vec2(-12f, 0f));

        Platform rightWall = new Platform(this, new BoxShape(1f, 14));
        rightWall.setPosition(new Vec2(12f, 0f));

        Platform roofOne = new Platform(this, new BoxShape(12f, 1f));
        roofOne.setPosition(new Vec2(0f, 12f));

        Platform containerZero = new Platform(this, new BoxShape(1f, 8f));
        containerZero.setPosition(new Vec2(-9f, 4f));

        Platform containerOne = new Platform(this, new BoxShape(1f, 2f));
        containerOne.setPosition(new Vec2(-6f, -10f));

        Platform containerOneHigh = new Platform(this, new BoxShape(1f, 6f));
        containerOneHigh.setPosition(new Vec2(-6f, 6f));

        Platform containerTwo = new Platform(this, new BoxShape(1f, 4f));
        containerTwo.setPosition(new Vec2(-3f, -8f));

        Platform containerTwoHigh = new Platform(this, new BoxShape(1f, 4f));
        containerTwoHigh.setPosition(new Vec2(-3f, 8f));

        Platform containerThree = new Platform(this, new BoxShape(1f, 6f));
        containerThree.setPosition(new Vec2(0f, -6f));

        Platform containerThreeHigh = new Platform(this, new BoxShape(1f, 2f));
        containerThreeHigh.setPosition(new Vec2(0f, 10f));

        Platform containerFour = new Platform(this, new BoxShape(1f, 8f));
        containerFour.setPosition(new Vec2(3f, -4f));

        Platform containerFive = new Platform(this, new BoxShape(1f, 10f));
        containerFive.setPosition(new Vec2(6f, -2f));

        FinishLine finishLine = new FinishLine(this, new BoxShape(2f, 1f));
        finishLine.setPosition(new Vec2(9f, -12f));
        finishLine.setNextLevel(2);

    }
    public Student getStudent() {
        return student;
    }
}