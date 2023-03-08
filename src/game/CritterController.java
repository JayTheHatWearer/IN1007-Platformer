package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import obstacle.Obstacle;
import org.jbox2d.common.Vec2;

import java.awt.*;


public class CritterController implements CollisionListener {

    private Critter collidedCritter;

    public CritterController(Critter c) {
        collidedCritter = c;
    }


    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collidedCritter.getLinearVelocity().x == 0) {
        collidedCritter.SwitchDirection();
        }
    }
}
