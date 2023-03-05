package game;

import city.cs.engine.*;
import city.cs.engine.Shape;

import java.awt.*;

public class Flipper extends StaticBody {

    private static final Shape flipperShape = new BoxShape(1,1);


    public Flipper(World world) {
        super(world, flipperShape);
        setFillColor(Color.MAGENTA);
    }

}
