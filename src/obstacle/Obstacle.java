package obstacle;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.awt.*;


public class Obstacle extends StaticBody {

    public Obstacle(World world, BoxShape obstacleSize) {
        super(world, obstacleSize);
        setAlwaysOutline(false);
        setFillColor(Color.red);
        setLineColor(Color.red);
    }
}
