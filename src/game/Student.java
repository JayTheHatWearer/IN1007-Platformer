package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.awt.*;

public class Student extends Walker {
    private String currentImage;
    private boolean isFlipped;
    private  Vec2 lastSaveLocation;

    private static final Shape studentShape = new BoxShape(1, 1.5f);

    public Student(World world) {
        super(world, studentShape);
        setFillColor(Color.PINK);
    }

    public boolean getFlipped() {
        return isFlipped;
    }

    public void setFlipped(boolean flipValue) {
        isFlipped = flipValue;

        if (isFlipped) {
            setGravityScale(-1.5f);
            setFillColor(Color.MAGENTA);
            setLineColor(Color.MAGENTA);
        } else {
            setGravityScale(1.5f);
            setFillColor(Color.PINK);
            setLineColor(Color.PINK);
        }
    }

    public void returnStudent() {
        setPosition(lastSaveLocation);
    }

    public void setReturnPosition(Vec2 saveLocation) {
        lastSaveLocation = saveLocation;
    }

    @Override
    public void jump(float speed) {
        Vec2 v = this.getLinearVelocity();
        if (isFlipped) {
            if (Math.abs(v.y) < 0.01F) {
                this.setLinearVelocity(new Vec2(v.x, -speed));
            }
        } else {
            if (Math.abs(v.y) < 0.01F) {
                this.setLinearVelocity(new Vec2(v.x, speed));
            }
        }
    }


    public void stateManager(Vec2 velocity) {
        String newState = null;
        if ( velocity.x > -0.1 && velocity.x < 0.1 && velocity.y < 0.1) {
            newState = "idle";
        } else if (velocity.x >= 0.1) {
            newState = "run";
        } else if (velocity.x <= -0.1) {
            newState = "run-left";
        }

        if (newState != null && !newState.equals(currentImage)) {
            this.removeAllImages();
            this.addImage(new BodyImage("data/sprites/pc/pc-" + newState + ".gif", 3));
            currentImage = newState;
        }
    }


}