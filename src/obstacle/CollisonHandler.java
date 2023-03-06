package obstacle;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import game.*;
import org.jbox2d.common.Vec2;

import java.awt.*;

public class CollisonHandler implements CollisionListener {

    private final Student student;
    public CollisonHandler(Student s) {
        this.student = s;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Obstacle) {
            student.setFlipped(false);
            student.returnStudent();
            student.setLinearVelocity(new Vec2(0,0));
        } else if (e.getOtherBody() instanceof CheckPoint) {
            student.setReturnPosition(((CheckPoint) e.getOtherBody()).getCheckpointLocation());
            e.getOtherBody().setFillColor(new Color(0, 100, 0));
            e.getOtherBody().setLineColor(new Color(0, 100, 0));
        } else if (e.getOtherBody() instanceof Flipper) {
            student.setFlipped((!student.getFlipped()));
            e.getOtherBody().destroy();
        } else if (e.getOtherBody() instanceof FinishLine) {
            e.getOtherBody().destroy();
            student.destroy();
            Game.getLevelManager().loadLevel(Game.getView(), ((FinishLine) e.getOtherBody()).getNextLevel());
        }
    }
}
