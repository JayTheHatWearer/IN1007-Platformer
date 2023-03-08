package game;

import city.cs.engine.*;
import city.cs.engine.Shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Flipper extends StaticBody {

    private static final Shape flipperShape = new BoxShape(1,1);

    private List<Flipper> collectedFlipper = new ArrayList<>();


    public Flipper(World world) {
        super(world, flipperShape);
        setFillColor(Color.MAGENTA);
        this.addImage(new BodyImage("data/sprites/tech-pickup.gif", 4));
    }


}
