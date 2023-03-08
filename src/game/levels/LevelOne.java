package game.levels;

import city.cs.engine.*;
import game.*;
import obstacle.Obstacle;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;

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
        student.setReturnPosition(new Vec2(-18f, 6f));

        Critter critterOne = new Critter(this);
        critterOne.setPosition(new Vec2(19f, -1.5f));
        CritterController critterOneController = new CritterController(critterOne);
        critterOne.addCollisionListener(critterOneController);


        this.addStepListener(new Tracker(Game.getView(), this.getStudent()));

        Game.getView().setBounds(-20, 28);
        Image background1 = new ImageIcon("data/img/level2-bg.png").getImage();
        Game.getView().setBackground(background1);
    }

    private void CreateBoundary() {

    }

    private void Populate() {
        // create the containers
        Platform[] defaultContainers = new Platform[61];
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
        defaultContainers[16] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[17] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[18] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[19] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[20] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[21] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[22] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[23] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[24] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[25] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[26] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[27] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[28] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[29] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[30] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[31] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[32] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[33] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[34] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[35] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[36] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[37] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[38] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[39] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[40] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[41] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[42] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[43] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[44] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[45] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[46] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[47] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[48] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[49] = new Platform(this, new BoxShape(1.5f ,1.5f));

        defaultContainers[50] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[51] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[52] = new Platform(this, new BoxShape(1.5f ,1.5f));

        defaultContainers[53] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[54] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[55] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[56] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[57] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[58] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[59] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[60] = new Platform(this, new BoxShape(1.5f ,1.5f));


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
        defaultContainers[7].SetType("ground", 12);

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

        defaultContainers[15].setPosition(new Vec2(-6.5f, 10.5f));
        defaultContainers[15].SetType("roof", 14);

        defaultContainers[16].setPosition(new Vec2(-6.5f,7.5f));
        defaultContainers[16].SetType("single", 2);

        defaultContainers[17].setPosition(new Vec2(-3.5f,10.5f));
        defaultContainers[17].SetType("roof", 0);

        defaultContainers[18].setPosition(new Vec2(-3.5f,7.5f));
        defaultContainers[18].SetType("single", 4);

        defaultContainers[19].setPosition(new Vec2(-0.5f,10.5f));
        defaultContainers[19].SetType("roof", 1);

        defaultContainers[20].setPosition(new Vec2(2.5f,10.5f));
        defaultContainers[20].SetType("roof", 2);

        defaultContainers[21].setPosition(new Vec2(5.5f,10.5f));
        defaultContainers[21].SetType("roof", 3);

        defaultContainers[22].setPosition(new Vec2(8.5f,10.5f));
        defaultContainers[22].SetType("roof", 4);

        defaultContainers[23].setPosition(new Vec2(11.5f,10.5f));
        defaultContainers[23].SetType("roof", 5);

        defaultContainers[24].setPosition(new Vec2(14.5f,10.5f));
        defaultContainers[24].SetType("roof", 6);

        defaultContainers[25].setPosition(new Vec2(17.5f,10.5f));
        defaultContainers[25].SetType("roof", 7);

        defaultContainers[26].setPosition(new Vec2(20.5f,10.5f));
        defaultContainers[26].SetType("roof", 8);

        defaultContainers[27].setPosition(new Vec2(23.5f,10.5f));
        defaultContainers[27].SetType("roof", 9);

        defaultContainers[28].setPosition(new Vec2(26.5f,10.5f));
        defaultContainers[28].SetType("roof", 14);

        defaultContainers[29].setPosition(new Vec2(26.5f,7.5f));
        defaultContainers[29].SetType("right-wall", 1);

        defaultContainers[30].setPosition(new Vec2(26.5f,4.5f));
        defaultContainers[30].SetType("right-wall", 2);

        defaultContainers[31].setPosition(new Vec2(26.5f,1.5f));
        defaultContainers[31].SetType("right-wall", 3);

        defaultContainers[32].setPosition(new Vec2(26.5f,-1.5f));
        defaultContainers[32].SetType("right-wall", 4);

        defaultContainers[33].setPosition(new Vec2(26.5f,-4.5f));
        defaultContainers[33].SetType("ground", 11);

        defaultContainers[34].setPosition(new Vec2(23.5f,-4.5f));
        defaultContainers[34].SetType("ground", 1);

        defaultContainers[35].setPosition(new Vec2(20.5f,-4.5f));
        defaultContainers[35].SetType("ground", 2);

        defaultContainers[36].setPosition(new Vec2(17.5f,-4.5f));
        defaultContainers[36].SetType("corner", 1);

        defaultContainers[37].setPosition(new Vec2(17.5f,-7.5f));
        defaultContainers[37].SetType("right-wall", 1);

        defaultContainers[38].setPosition(new Vec2(17.5f,-10.5f));
        defaultContainers[38].SetType("ground", 11);

        defaultContainers[39].setPosition(new Vec2(14.5f,-10.5f));
        defaultContainers[39].SetType("ground", 3);

        defaultContainers[40].setPosition(new Vec2(11.5f,-10.5f));
        defaultContainers[40].SetType("ground", 4);

        defaultContainers[41].setPosition(new Vec2(8.5f,-10.5f));
        defaultContainers[41].SetType("ground", 5);

        defaultContainers[42].setPosition(new Vec2(17.5f,-13.5f));
        defaultContainers[42].SetType("mid-wall", 2);

        defaultContainers[43].setPosition(new Vec2(20.5f, -7.5f));
        defaultContainers[43].SetType("blank", 0);

        defaultContainers[44].setPosition(new Vec2(23.5f, -7.5f));
        defaultContainers[44].SetType("blank", 0);

        defaultContainers[45].setPosition(new Vec2(26.5f, -7.5f));
        defaultContainers[45].SetType("blank", 0);

        defaultContainers[46].setPosition(new Vec2(20.5f, -10.5f));
        defaultContainers[46].SetType("blank", 0);

        defaultContainers[47].setPosition(new Vec2(23.5f, -10.5f));
        defaultContainers[47].SetType("blank", 0);

        defaultContainers[48].setPosition(new Vec2(26.5f, -10.5f));
        defaultContainers[48].SetType("blank", 0);

        defaultContainers[49].setPosition(new Vec2(17.5f,1.5f));
        defaultContainers[49].SetType("corner", 2);

        defaultContainers[50].setPosition(new Vec2(14.5f,1.5f));
        defaultContainers[50].SetType("candg", 1);

        defaultContainers[51].setPosition(new Vec2(11.5f,1.5f));
        defaultContainers[51].SetType("corner", 3);

        defaultContainers[52].setPosition(new Vec2(17.5f,-1.5f));
        defaultContainers[52].SetType("mid-wall", 2);

        defaultContainers[53].setPosition(new Vec2(11.5f,-1.5f));
        defaultContainers[53].SetType("single", 4);

        defaultContainers[54].setPosition(new Vec2(8.5f,-1.5f));
        defaultContainers[54].SetType("single", 3);

        defaultContainers[55].setPosition(new Vec2(5.5f,-1.5f));
        defaultContainers[55].SetType("single", 2);

        defaultContainers[56].setPosition(new Vec2(8.5f,1.5f));
        defaultContainers[56].SetType("blank", 0);

        defaultContainers[57].setPosition(new Vec2(5.5f,1.5f));
        defaultContainers[57].SetType("single", 5);

        defaultContainers[58].setPosition(new Vec2(5.5f,4.5f));
        defaultContainers[58].SetType("single", 6);

        defaultContainers[59].setPosition(new Vec2(8.5f,4.5f));
        defaultContainers[59].SetType("single", 7);

        defaultContainers[60].setPosition(new Vec2(11.5f,4.5f));
        defaultContainers[60].SetType("single", 8);

        Flipper flipperOne = new Flipper (this);
        flipperOne.setPosition(new Vec2(14.5f, -4.5f));

        Flipper flipperTwo = new Flipper (this);
        flipperTwo.setPosition(new Vec2(17.5f, 7.5f));


        Obstacle obstacleOne = new Obstacle(this, new BoxShape(3,1));
        obstacleOne.setPosition(new Vec2(-0.5f,-13.5f));

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