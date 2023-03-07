package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import java.awt.*;

public class CheckPoint extends StaticBody {

    private Vec2 checkpointLocation;

    public CheckPoint(World world, BoxShape obstacleSize) {

        super(world, obstacleSize);
        setFillColor(Color.green);
        setLineColor(Color.green);

    }

    public Vec2 getCheckpointLocation() {
    return checkpointLocation;
    }

    public void setCheckpointLocation(Vec2 checkpointLocationNew) {
        checkpointLocation = checkpointLocationNew;
    }
}
