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
        student.setPosition(new Vec2(-18f, 6f));
        student.setReturnPosition(new Vec2(-9f, -9f));
        CollisonHandler obstacleMain = new CollisonHandler(student);
        student.addCollisionListener(obstacleMain);

        this.addStepListener(new Tracker(Game.getView(), this.getStudent()));
        student.setAngle(-180);
    }

    private void CreateBoundary() {

    }

    private void Populate() {
        // create the containers
        Platform[] defaultContainers = new Platform[16];
        defaultContainers[0] = new Platform(this, new BoxShape(1.5f, 1.5f));
        defaultContainers[1] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[2] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[3] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[4] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[5] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[6] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[7] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[8] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[9] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[10] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[11] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[12] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[13] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[14] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[15] = new Platform(this, new BoxShape(1.5f ,1.5f));


        defaultContainers[0].setPosition(new Vec2(-18.5f, 4.5f));
        defaultContainers[0].SetType("platform-edge-right-single", 0);

        defaultContainers[1].setPosition(new Vec2(-18.5f, -10.5f));
        defaultContainers[1].SetType("ground", 1);

        defaultContainers[2].setPosition(new Vec2(-15.5f, -10.5f));
        defaultContainers[2].SetType("ground",2);

        defaultContainers[3].setPosition(new Vec2(-12.5f, -10.5f));
        defaultContainers[3].SetType("ground",3);

        defaultContainers[4].setPosition(new Vec2(-9.5f, -10.5f));
        defaultContainers[4].SetType("ground", 4);

        defaultContainers[5].setPosition(new Vec2(-6.5f, -10.5f));
        defaultContainers[5].SetType("ground", 5);

        defaultContainers[6].setPosition(new Vec2(-3.5f, -10.5f));
        defaultContainers[6].SetType("ground", 13);

        defaultContainers[7].setPosition(new Vec2(5.5f, -10.5f));
        defaultContainers[7].SetType("single", 1);

        defaultContainers[8].setPosition(new Vec2(-12.5f, -1.5f));
        defaultContainers[8].SetType("independent", 1);

        defaultContainers[9].setPosition(new Vec2(-9.5f, -1.5f));
        defaultContainers[9].SetType("independent", 2);

        defaultContainers[10].setPosition(new Vec2(-6.5f, -1.5f));
        defaultContainers[10].SetType("independent", 4);

        defaultContainers[11].setPosition(new Vec2(-18.5f, 10.5f));
        defaultContainers[11].SetType("roof", 1);

        defaultContainers[12].setPosition(new Vec2(-15.5f, 10.5f));
        defaultContainers[12].SetType("roof", 2);

        defaultContainers[13].setPosition(new Vec2(-12.5f, 10.5f));
        defaultContainers[13].SetType("roof", 3);

        defaultContainers[14].setPosition(new Vec2(-9.5f, 10.5f));
        defaultContainers[14].SetType("roof", 4);

        defaultContainers[15].setPosition(new Vec2(14f, -9f));



        // create the finish line
        FinishLine finishLine = new FinishLine(this, new BoxShape(2f, 1f));
        finishLine.setPosition(new Vec2(9f, -12f));
        finishLine.setNextLevel(2);

        CreateBoundary();
    }

    public Student getStudent() {
        return student;
    }
}