package game;

import city.cs.engine.*;
import city.cs.engine.Shape;

import java.awt.*;

public class Critter extends Walker {

    private int direction;

    private static final Shape studentShape = new BoxShape(1, 1);

    public Critter(World world) {
        super(world, studentShape);
        setFillColor(Color.PINK);
        direction = 1;
        startWalking(5);
    }

    // TODO
    /* Two ways to go about dynamic body movement:
        1. Implement step listener
        2. Implement collision listener and apply variable on each instance of platform.

    */
    public void SwitchDirection() {
        stopWalking();
        if (direction == 1) {
            direction = 0;
            startWalking(-5f);
            this.removeAllImages();
            this.addImage(new BodyImage("data/sprites/critter/critter-move-left.gif",2));
        } else {
            direction = 1;
            startWalking(5f);
            this.removeAllImages();
            this.addImage(new BodyImage("data/sprites/critter/critter-move-right.gif",2));
        }
    }
}
