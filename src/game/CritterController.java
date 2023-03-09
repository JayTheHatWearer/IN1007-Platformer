package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;


public class CritterController implements CollisionListener {

    private final Critter collidedCritter;

    public CritterController(Critter c) {
        collidedCritter = c;
    }


    @Override
    public void collide(CollisionEvent collisionEvent) {

        if (collisionEvent.getOtherBody() instanceof Platform) {
            Platform targetPlatform = (Platform) collisionEvent.getOtherBody();
            if (targetPlatform.getBoundary()) {
                collidedCritter.SwitchDirection();
            }
        } else if (collisionEvent.getOtherBody() instanceof Student) {
            ((Student) collisionEvent.getOtherBody()).Respawn();
        }


    }
}