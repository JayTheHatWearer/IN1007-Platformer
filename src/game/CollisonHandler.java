package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import obstacle.Obstacle;

import java.awt.*;

public class CollisonHandler implements CollisionListener {

    private final Student student;


    public CollisonHandler(Student s) {
        this.student = s;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Obstacle) {
            student.Respawn();
        } else if (e.getOtherBody() instanceof CheckPoint) {
            student.setReturnPosition(((CheckPoint) e.getOtherBody()).getCheckpointLocation());
            e.getOtherBody().setFillColor(new Color(0, 100, 0));
            e.getOtherBody().setLineColor(new Color(0, 100, 0));
        } else if (e.getOtherBody() instanceof Flipper) {

            student.setFlipped((!student.getFlipped()));
            student.stateManager(student.getLinearVelocity());
            student.addCollectedFlippers((Flipper) e.getOtherBody());
            Game.getLevelManager().ChangeSound("data/sounds/flipper.wav", true);

        } else if (e.getOtherBody() instanceof FinishLine) {
            e.getOtherBody().destroy();
            student.destroy();
            Game.getLevelManager().loadLevel(Game.getView(), ((FinishLine) e.getOtherBody()).getNextLevel());
            Game.getLevelManager().ChangeSound("data/sounds/teleport.wav", true);
        }
    }



}
