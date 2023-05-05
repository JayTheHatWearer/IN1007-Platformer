package game.levels;


import city.cs.engine.BoxShape;
import city.cs.engine.World;
import game.*;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;

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
        Tracker trackerMain = new Tracker(Game.getView(), this.getStudent());
        this.addStepListener(trackerMain);

    }

    private void Populate() {

        FinishLine finishLine = new FinishLine(this, new BoxShape(0.66f, 2f));
        finishLine.setPosition(new Vec2(15f, -6f));
        CreateBoundary();

        finishLine.setNextLevel(2);
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

            Platform leftWall = new Platform(this, new BoxShape(1f, 12));
            leftWall.setPosition(new Vec2(-21f, 0f));

        }
    public Student getStudent() {
        return student;
    }



}