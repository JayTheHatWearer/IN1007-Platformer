package game;

import city.cs.engine.BodyImage;
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
        this.addImage(new BodyImage("data/tile.png", 2));
    }

    public void SetType(String type) {
        this.removeAllImages();
        if (type.equals("ground")) {
            addImage(new BodyImage("data/ground.png", 2));
        } else if (type.equals("ground-left")) {
            addImage(new BodyImage("data/ground-left.png", 2));
        }
    }
}
