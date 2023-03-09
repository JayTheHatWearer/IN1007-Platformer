package game.levels;

import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.World;
import game.*;
import org.jbox2d.common.Vec2;

public class LevelZero extends World {
    private final Student student;
    private Tracker trackerMain;

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
        trackerMain = new Tracker(Game.getView(), this.getStudent());
        this.addStepListener(trackerMain);

    }

    private void Populate() {

        Platform aKey = new Platform(this, new BoxShape(2.5f, 2.5f));
        aKey.setPosition(new Vec2(-3.5f,2.5f));
        aKey.SetType("special", 0);
        aKey.addImage(new BodyImage("data/img/keys/A.gif", 5));

        Platform dKey = new Platform(this, new BoxShape(2.5f, 2.5f));
        dKey.setPosition(new Vec2(3.5f,2.5f));
        dKey.SetType("special", 0);
        dKey.addImage(new BodyImage("data/img/keys/D.gif", 5));

        FinishLine finishLine = new FinishLine(this, new BoxShape(0.66f, 2f));
        finishLine.setPosition(new Vec2(15f, -6f));
        CreateBoundary();

        finishLine.setNextLevel(1);
    }

        private void CreateBoundary() {

            Platform groundOne = new Platform(this, new BoxShape(10f, 1.5f));
            groundOne.SetType("ground",0);
            groundOne.setPosition(new Vec2(-10f, -10.5f));

            Platform groundTwo = new Platform(this, new BoxShape(10f, 1.5f));
            groundTwo.SetType("ground",0);
            groundTwo.setPosition(new Vec2(10f, -10.5f));

            Platform rightWall = new Platform(this, new BoxShape(1f, 12));
            rightWall.setPosition(new Vec2(21f, 0f));

            Platform roofOne = new Platform(this, new BoxShape(10f, 1f));
            roofOne.setPosition(new Vec2(0f, 13f));

        }
    public Student getStudent() {
        return student;
    }

    public Tracker getTracker() { return trackerMain;}


}