package game.levels;

import city.cs.engine.BoxShape;
import city.cs.engine.World;
import game.CheckPoint;
import game.CollisonHandler;
import game.Platform;
import game.Student;
import org.jbox2d.common.Vec2;

public class LevelThree extends World {
    private final Student student;
    public LevelThree() {
        super();

        //init ground

        Platform groundOne = new Platform(this, new BoxShape(12f, 1f));
        groundOne.setPosition(new Vec2(-4f, -12f));

        Platform leftWall = new Platform(this, new BoxShape(1f, 12));
        leftWall.setPosition(new Vec2(-12f, 0f));

        Platform rightWall = new Platform(this, new BoxShape(1f, 14));
        rightWall.setPosition(new Vec2(12f, 0f));

        Platform roofOne = new Platform(this, new BoxShape(11f, 1f));
        roofOne.setPosition(new Vec2(-4f, 12f));

        Platform containerOne = new Platform(this, new BoxShape(1f, 10f));
        containerOne.setPosition(new Vec2(-6f,-2f));

        Platform containerTwo = new Platform(this, new BoxShape(1f, 10f));
        containerTwo.setPosition(new Vec2(0f,2f));

        Platform containerThree = new Platform(this, new BoxShape(1f, 6f));
        containerThree.setPosition(new Vec2(6f,-8f));

        Platform containerFour = new Platform(this, new BoxShape(4f, 6f));
        containerFour.setPosition(new Vec2(3f,8));

        Platform containerFive = new Platform(this, new BoxShape(4f, 6f));
        containerFive.setPosition(new Vec2(10f,-8));
        CheckPoint finishLine = new CheckPoint(this, new BoxShape(2f, 1f));
        finishLine.setPosition(new Vec2(9f, 12f));
        //make a character (with an overlaid image)
        student = new Student(this);
        student.setPosition(new Vec2(-9f, -9f));
        student.setReturnPosition(new Vec2(-9f, -9f));
        CollisonHandler obstacleMain = new CollisonHandler(student);
        student.addCollisionListener(obstacleMain);
    }

    public Student getStudent() {
        return student;
    }
}