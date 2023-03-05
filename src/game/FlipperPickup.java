package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class FlipperPickup implements CollisionListener {
    private Student student;
    public FlipperPickup(Student s) {
        this.student = s;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Flipper) {
            student.setFlipped((!student.getFlipped()));
            e.getOtherBody().destroy();
        }
    }
}
