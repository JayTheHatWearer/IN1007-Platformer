package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

public class StudentController implements KeyListener {
    boolean isFlipped;
    Student student;
    public StudentController(Student Instudent) {
        student = Instudent;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_1) {
            student.startWalking(-5);
            student.setAngleDegrees(-360);
        } else if (code == KeyEvent.VK_2) {
            student.startWalking(5);
            student.setAngleDegrees(360);
        } else if (code == KeyEvent.VK_SPACE) {
            student.jump(10);
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        student.stopWalking();

    }
}