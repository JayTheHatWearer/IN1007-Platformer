package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class DroneCollisions implements CollisionListener {

    private final Drone drone;
    public DroneCollisions(Drone drone) {
        this.drone = drone;
    }
    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody() instanceof Student) {
            drone.Crash();
        } else {
            drone.destroy();
        }
    }
}
