package game;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;

public class Tracker implements StepListener {
    private final GameView  view;
    private final Student student;

    public Tracker(GameView view, Student student) {
        this.view = view;
        this.student = student;
    }
    public void preStep(StepEvent e) {}
    public void postStep(StepEvent e) {
        view.getGameViewCentre(student.getPosition());
        student.stateManager(student.getLinearVelocity());

    }
}