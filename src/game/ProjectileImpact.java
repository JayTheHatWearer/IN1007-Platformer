package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class ProjectileImpact implements CollisionListener {

    Student student = Game.getLevelManager().currentStudent;


    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody() == student) {
            student.Respawn();
            collisionEvent.getReportingBody().destroy();
        } else {
            collisionEvent.getReportingBody().destroy();
        }
    }
}
