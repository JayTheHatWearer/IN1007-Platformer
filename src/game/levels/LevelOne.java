package game.levels;

import city.cs.engine.BoxShape;
import city.cs.engine.World;
import game.*;
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

        this.addStepListener(new Tracker(Game.getView(), this.getStudent()));
    }

    private void Populate() {
        // create the ground
        Platform ground = new Platform(this, new BoxShape(14f, 1f));
        ground.setPosition(new Vec2(-7f, -12f));

        // create the left wall
        Platform leftWall = new Platform(this, new BoxShape(1f, 12));
        leftWall.setPosition(new Vec2(-12f, 0f));

        // create the right wall
        Platform rightWall = new Platform(this, new BoxShape(1f, 14));
        rightWall.setPosition(new Vec2(12f, 0f));

        // create the roof
        Platform roof = new Platform(this, new BoxShape(12f, 1f));
        roof.setPosition(new Vec2(0f, 12f));

        // create the containers
        Platform[] containers = new Platform[9];
        containers[0] = new Platform(this, new BoxShape(1f, 8f));
        containers[1] = new Platform(this, new BoxShape(1f, 2f));
        containers[2] = new Platform(this, new BoxShape(1f, 4f));
        containers[3] = new Platform(this, new BoxShape(1f, 6f));
        containers[4] = new Platform(this, new BoxShape(1f, 8f));
        containers[5] = new Platform(this, new BoxShape(1f, 10f));
        containers[6] = new Platform(this, new BoxShape(1f, 6f));
        containers[7] = new Platform(this, new BoxShape(1f, 4f));
        containers[8] = new Platform(this, new BoxShape(1f, 2f));

        containers[0].setPosition(new Vec2(-9f, 4f));
        containers[1].setPosition(new Vec2(-6f, -10f));
        containers[2].setPosition(new Vec2(-3f, -8f));
        containers[3].setPosition(new Vec2(0f, -6f));
        containers[4].setPosition(new Vec2(3f, -4f));
        containers[5].setPosition(new Vec2(6f, -2f));
        containers[6].setPosition(new Vec2(-6f, 6f));
        containers[7].setPosition(new Vec2(-3f, 8f));
        containers[8].setPosition(new Vec2(0f, 10f));

        // create the finish line
        FinishLine finishLine = new FinishLine(this, new BoxShape(2f, 1f));
        finishLine.setPosition(new Vec2(9f, -12f));
        finishLine.setNextLevel(2);
    }

    public Student getStudent() {
        return student;
    }
}