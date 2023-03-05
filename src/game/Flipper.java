package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;

import java.awt.*;

public class Flipper extends StaticBody {

    private static final Shape flipperShape = new BoxShape(1,1);


    public Flipper(World world) {
        super(world, flipperShape);
        setFillColor(Color.MAGENTA);
    }

}
