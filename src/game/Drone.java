package game;

import city.cs.engine.DynamicBody;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;

public class Drone extends DynamicBody {

    public Drone(World w) {
        super(w);
    }

    public void shoot() {

        Vec2 studentPosition = new Vec2();
        studentPosition = Game.getLevelManager().currentStudent.getPosition();

        double dot = Vec2.dot(getPosition(), studentPosition);
        double det = (getPosition().x * studentPosition.y) - (getPosition().y * studentPosition.x);
        double angle = Math.atan2(dot, det);


    }
}
