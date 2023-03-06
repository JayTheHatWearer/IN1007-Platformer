package game.levels;

import city.cs.engine.BoxShape;
import city.cs.engine.World;
import game.FinishLine;
import game.Platform;
import game.Student;
import obstacle.CollisonHandler;
import org.jbox2d.common.Vec2;

public class LevelZero extends World {
    private final Student student;
    public LevelZero() {
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



        FinishLine finishLine = new FinishLine(this, new BoxShape(2f, 1f));
        finishLine.setPosition(new Vec2(9f, -12f));
        finishLine.setNextLevel(1);

    }
    public Student getStudent() {
        return student;
    }
}