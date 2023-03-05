package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.Walker;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;

import java.awt.*;

public class Student extends Walker {

    private boolean isFlipped;
    private Vec2 lastSaveLocation;

    private static final Shape studentShape = new BoxShape(1, 1);


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
        } else {
            setGravityScale(1.5f);
            ;
            setFillColor(Color.PINK);
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
}