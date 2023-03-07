package game;

import city.cs.engine.UserView;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;

public class GameView extends UserView {

    private int minX = -20;
    private int maxX = 20;
    private int imageWidth = 800;

    private Image background;

    public GameView(World world, int width, int height) {
        super(world, width, height);
        background = new ImageIcon("data/img/level1-bg.png").getImage();

    }

    public void getGameViewCentre(Vec2 studentPosition) {
        int quarterMetreWidth = 20;
        if (0 >= studentPosition.x) {
            Game.getView().setCentre(new Vec2(0, 0));
        } else if ((maxX - (quarterMetreWidth)) <= studentPosition.x) {
            Game.getView().setCentre(new Vec2((maxX - (quarterMetreWidth)), 0));
        } else {
            Game.getView().setCentre(new Vec2(studentPosition.x, 0));
        }

    }

    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background,(int) (0 -  this.getCentre().x * 20), (int) this.getCentre().y, imageWidth, 480,  this);
    }

    public void setBounds(int newMin, int newMax) {
        minX = newMin;
        maxX = newMax;
    }
}