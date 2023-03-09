package game;

import city.cs.engine.*;

public class ProjectileImpact implements CollisionListener {

    Student student = Game.getLevelManager().currentStudent;


    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody() == student) {
            student.Respawn();
        } else {
            collisionEvent.getReportingBody().destroy();
        }
    }
}