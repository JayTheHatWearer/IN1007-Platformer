package game.levels;

import city.cs.engine.BoxShape;
import city.cs.engine.World;
import game.*;
import obstacle.Obstacle;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;

public class LevelTwo extends World {
    private final Student student;
    public LevelTwo() {
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

        this.addStepListener(new Tracker(Game.getView(), student));

        Game.getView().setBounds(-20, 28);
        Image background1 = new ImageIcon("data/img/level1-bg.png").getImage();
        Game.getView().setBackground(background1);
    }

    private void Populate() {
        // create the containers
        Platform[] defaultContainers = new Platform[74];
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
        defaultContainers[61] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[62] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[63] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[64] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[65] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[66] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[67] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[68] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[69] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[70] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[71] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[72] = new Platform(this, new BoxShape(1.5f ,1.5f));
        defaultContainers[73] = new Platform(this, new BoxShape(1.5f ,1.5f));

        defaultContainers[0].setPosition(new Vec2(-18.5f, 4.5f));
        defaultContainers[0].SetType("ground", 13);

        defaultContainers[1].setPosition(new Vec2(-18.5f, 1.5f));
        defaultContainers[1].SetType("left-wall", 0);

        defaultContainers[2].setPosition(new Vec2(-18.5f, -1.5f));
        defaultContainers[2].SetType("left-wall",1);

        defaultContainers[3].setPosition(new Vec2(-18.5f, -4.5f));
        defaultContainers[3].SetType("left-wall",2);

        defaultContainers[4].setPosition(new Vec2(-18.5f, -7.5f));
        defaultContainers[4].SetType("left-wall", 3);

        defaultContainers[5].setPosition(new Vec2(-18.5f, -10.5f));
        defaultContainers[5].SetType("corner", 4);

        defaultContainers[6].setPosition(new Vec2(-15.5f, -10.5f));
        defaultContainers[6].SetType("ground", 5);

        defaultContainers[7].setPosition(new Vec2(-12.5f, -10.5f));
        defaultContainers[7].SetType("ground", 4);

        defaultContainers[8].setPosition(new Vec2(-9.5f, -10.5f));
        defaultContainers[8].SetType("ground", 10);

        defaultContainers[9].setPosition(new Vec2(-9.5f, 10.5f));
        defaultContainers[9].SetType("roof", 3);

        defaultContainers[10].setPosition(new Vec2(-6.5f, -10.5f));
        defaultContainers[10].SetType("ground", 11);

        defaultContainers[11].setPosition(new Vec2(-18.5f, 10.5f));
        defaultContainers[11].SetType("roof", 1);

        defaultContainers[12].setPosition(new Vec2(-15.5f, 10.5f));
        defaultContainers[12].SetType("roof", 2);

        defaultContainers[13].setPosition(new Vec2(-12.5f, 7.5f));
        defaultContainers[13].SetType("mid-wall", 1);

        defaultContainers[14].setPosition(new Vec2(-12.5f, 4.5f));
        defaultContainers[14].SetType("mid-wall", 2);

        defaultContainers[15].setPosition(new Vec2(-12.5f, 1.5f));
        defaultContainers[15].SetType("mid-wall", 3);

        defaultContainers[16].setPosition(new Vec2(-12.5f, -1.5f));
        defaultContainers[16].SetType("mid-wall", 1);

        defaultContainers[17].setPosition(new Vec2(-12.5f,-4.5f));
        defaultContainers[17].SetType("mid-wall", 4);

        defaultContainers[18].setPosition(new Vec2(14.5f,7.5f));
        defaultContainers[18].SetType("blank", 1);

        defaultContainers[19].setPosition(new Vec2(-12.5f,10.5f));
        defaultContainers[19].SetType("corner", 5);

        defaultContainers[20].setPosition(new Vec2(-6.5f,-7.5f));
        defaultContainers[20].SetType("right-wall", 2);

        defaultContainers[21].setPosition(new Vec2(-6.5f,-1.5f));
        defaultContainers[21].SetType("right-wall", 3);

        defaultContainers[22].setPosition(new Vec2(-6.5f,-4.5f));
        defaultContainers[22].SetType("right-wall", 4);

        defaultContainers[23].setPosition(new Vec2(-6.5f,1.5f));
        defaultContainers[23].SetType("ground", 12);

        defaultContainers[24].setPosition(new Vec2(-3.5f,1.5f));
        defaultContainers[24].SetType("ground", 4);

        defaultContainers[25].setPosition(new Vec2(-0.5f,1.5f));
        defaultContainers[25].SetType("ground", 13);

        defaultContainers[26].setPosition(new Vec2(-3.5f,-1.5f));
        defaultContainers[26].SetType("blank", 1);

        defaultContainers[27].setPosition(new Vec2(-0.5f,-1.5f));
        defaultContainers[27].SetType("left-wall", 2);

        defaultContainers[28].setPosition(new Vec2(-0.5f,-4.5f));
        defaultContainers[28].SetType("single", 4);

        defaultContainers[29].setPosition(new Vec2(-3.5f,-4.5f));
        defaultContainers[29].SetType("corner", 6);

        defaultContainers[30].setPosition(new Vec2(-3.5f,-7.5f));
        defaultContainers[30].SetType("left-wall", 2);

        defaultContainers[31].setPosition(new Vec2(-3.5f,-10.5f));
        defaultContainers[31].SetType("corner", 4);

        defaultContainers[32].setPosition(new Vec2(-0.5f,-10.5f));
        defaultContainers[32].SetType("ground", 4);

        defaultContainers[33].setPosition(new Vec2(2.5f,-10.5f));
        defaultContainers[33].SetType("ground", 5);

        defaultContainers[34].setPosition(new Vec2(5.5f,-10.5f));
        defaultContainers[34].SetType("ground", 1);

        defaultContainers[35].setPosition(new Vec2(8.5f,-10.5f));
        defaultContainers[35].SetType("corner", 7);

        defaultContainers[36].setPosition(new Vec2(8.5f,-7.5f));
        defaultContainers[36].SetType("right-wall", 1);

        defaultContainers[37].setPosition(new Vec2(8.5f,-4.5f));
        defaultContainers[37].SetType("ground", 12);

        defaultContainers[38].setPosition(new Vec2(26.5f,-7.5f));
        defaultContainers[38].SetType("right-wall", 4);

        defaultContainers[39].setPosition(new Vec2(26.5f,-10.5f));
        defaultContainers[39].SetType("right-wall", 3);

        defaultContainers[40].setPosition(new Vec2(11.5f,-10.5f));
        defaultContainers[40].SetType("blank", 1);

        defaultContainers[41].setPosition(new Vec2(-6.5f,10.5f));
        defaultContainers[41].SetType("roof", 5);

        defaultContainers[42].setPosition(new Vec2(-3.5f,10.5f));
        defaultContainers[42].SetType("roof", 4);

        defaultContainers[43].setPosition(new Vec2(-0.5f, 10.5f));
        defaultContainers[43].SetType("roof", 3);

        defaultContainers[44].setPosition(new Vec2(2.5f, 10.5f));
        defaultContainers[44].SetType("roof", 4);

        defaultContainers[45].setPosition(new Vec2(11.5f, 7.5f));
        defaultContainers[45].SetType("right-wall", 4);

        defaultContainers[46].setPosition(new Vec2(11.5f, 10.5f));
        defaultContainers[46].SetType("roof", 14);

        defaultContainers[47].setPosition(new Vec2(11.5f, -4.5f));
        defaultContainers[47].SetType("ground", 5);

        defaultContainers[48].setPosition(new Vec2(14.5f, -4.5f));
        defaultContainers[48].SetType("ground", 13);

        defaultContainers[49].setPosition(new Vec2(14.5f,-7.5f));
        defaultContainers[49].SetType("left-wall", 5);

        defaultContainers[50].setPosition(new Vec2(14.5f,-10.5f));
        defaultContainers[50].SetType("left-wall", 3);

        defaultContainers[51].setPosition(new Vec2(11.5f,1.5f));
        defaultContainers[51].SetType("corner", 8);

        defaultContainers[52].setPosition(new Vec2(14.5f,4.5f));
        defaultContainers[52].SetType("blank", 1);
        defaultContainers[52].setBoundary(true);

        defaultContainers[53].setPosition(new Vec2(14.5f,1.5f));
        defaultContainers[53].SetType("roof", 2);

        defaultContainers[54].setPosition(new Vec2(17.5f,1.5f));
        defaultContainers[54].SetType("roof", 3);

        defaultContainers[55].setPosition(new Vec2(11.5f,-7.5f));
        defaultContainers[55].SetType("blank", 1);

        defaultContainers[56].setPosition(new Vec2(8.5f,1.5f));
        defaultContainers[56].SetType("independent", 2);

        defaultContainers[57].setPosition(new Vec2(5.5f,1.5f));
        defaultContainers[57].SetType("independent", 1);

        defaultContainers[58].setPosition(new Vec2(5.5f,10.5f));
        defaultContainers[58].SetType("roof", 6);

        defaultContainers[59].setPosition(new Vec2(8.5f,10.5f));
        defaultContainers[59].SetType("roof", 7);

        defaultContainers[60].setPosition(new Vec2(11.5f,4.5f));
        defaultContainers[60].SetType("right-wall", 3);

        defaultContainers[60].setPosition(new Vec2(20.5f,1.5f));
        defaultContainers[60].SetType("single", 4);

        defaultContainers[61].setPosition(new Vec2(26.5f,-4.5f));
        defaultContainers[61].SetType("right-wall", 5);

        defaultContainers[62].setPosition(new Vec2(26.5f,-1.5f));
        defaultContainers[62].SetType("right-wall", 4);

        defaultContainers[63].setPosition(new Vec2(26.5f,1.5f));
        defaultContainers[63].SetType("right-wall", 3);

        defaultContainers[64].setPosition(new Vec2(26.5f,4.5f));
        defaultContainers[64].SetType("right-wall", 2);

        defaultContainers[65].setPosition(new Vec2(26.5f,7.5f));
        defaultContainers[65].SetType("right-wall", 1);

        defaultContainers[66].setPosition(new Vec2(26.5f,10.5f));
        defaultContainers[66].SetType("right-wall", 2);

        defaultContainers[64].setPosition(new Vec2(11.5f,4.5f));
        defaultContainers[64].SetType("right-wall", 2);

        defaultContainers[65].setPosition(new Vec2(20.5f,4.5f));
        defaultContainers[65].SetType("ground", 13);

        defaultContainers[66].setPosition(new Vec2(17.5f,4.5f));
        defaultContainers[66].SetType("corner", 4);

        defaultContainers[67].setPosition(new Vec2(17.5f,7.5f));
        defaultContainers[67].SetType("left-wall", 2);

        defaultContainers[68].setPosition(new Vec2(17.5f,10.5f));
        defaultContainers[68].SetType("left-wall", 5);


        defaultContainers[69].setPosition(new Vec2(14.5f,10.5f));
        defaultContainers[69].SetType("blank", 1);

        defaultContainers[70].setPosition(new Vec2(26.5f,4.5f));
        defaultContainers[70].SetType("right-wall", 5);

        defaultContainers[71].setPosition(new Vec2(26.5f,4.5f));
        defaultContainers[71].SetType("right-wall", 2);

        defaultContainers[72].setPosition(new Vec2(26.5f,7.5f));
        defaultContainers[72].SetType("right-wall", 1);

        defaultContainers[73].setPosition(new Vec2(26.5f,10.5f));
        defaultContainers[73].SetType("right-wall", 4);

        FinishLine finishLine = new FinishLine(this, new BoxShape(0.66f, 2f));
        finishLine.setPosition(new Vec2(20.5f, 9f));
        finishLine.setNextLevel(1);


        Flipper flipper = new Flipper(this, new Vec2(-9.5f, -7.5f));
        Flipper flipper2 = new Flipper(this, new Vec2(8.5f, 7.5f));
        Flipper flipper3 = new Flipper(this, new Vec2(-0.5f, -7.5f));
        Flipper flipper4 = new Flipper(this, new Vec2(8.5f, -1.5f));
        Flipper flipper5 = new Flipper(this, new Vec2(20.5f, -7.5f));

        Obstacle obstacleOne = new Obstacle(this, new BoxShape(4.5f,1.5f));
        obstacleOne.setPosition(new Vec2(20.5f,-13.5f));

        Obstacle obstacleTwo = new Obstacle(this, new BoxShape(3f,1.5f));
        obstacleTwo.setPosition(new Vec2(22f,13.5f));
    }

    public Student getStudent() {
        return student;
    }

}