package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.awt.*;

public class Flipper extends StaticBody {

    private static final Shape flipperShape = new BoxShape(1,1);
    private boolean isDestroyed;

    private final Vec2 savedPosition;


    public Flipper(World world, Vec2 position) {
        super(world, flipperShape);
        setFillColor(Color.MAGENTA);
        this.addImage(new BodyImage("data/sprites/tech-pickup.gif", 4));
        savedPosition = position;
        setPosition(savedPosition);
    }

    public boolean getState() {
        return isDestroyed;
    }

    public void setState(boolean isDestroyed) {
        this.destroy();

        if (!isDestroyed) {
            this.isDestroyed = isDestroyed;
            new Flipper(Game.getView().getWorld(), savedPosition);
        }
    }

    public void ResetFlipper() {
        this.setState(false);
    }

}
