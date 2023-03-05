package game;

import city.cs.engine.BoxShape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;

import java.awt.*;

public class Platform extends StaticBody {
    public Platform(World world, BoxShape obstacleSize) {
        super(world, obstacleSize);
        setAlwaysOutline(false);
        setFillColor(Color.GRAY);
        setLineColor(Color.GRAY);
    }
}
