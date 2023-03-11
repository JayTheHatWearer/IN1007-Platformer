package game;

import game.levels.LevelOne;
import game.levels.LevelThree;
import game.levels.LevelTwo;
import game.levels.LevelZero;

import java.util.ArrayList;

public class LevelManager {
    int levelNumber;
    Student currentStudent;

    public LevelManager() {

    }

    public void loadLevel(GameView view, int levelToBe) {
        view.getWorld().stop();
        switch (levelToBe) {
            case 0 -> {
                LevelZero worldZero = new LevelZero();

                currentStudent = worldZero.getStudent();

                view.setWorld(worldZero);
                StudentController controller = new StudentController(currentStudent);
                view.addKeyListener(controller);
                worldZero.start();
            }
            case 1 -> {
                LevelOne worldOne = new LevelOne();

                currentStudent = worldOne.getStudent();

                view.setWorld(worldOne);
                StudentController controllerOne = new StudentController(currentStudent);
                view.addKeyListener(controllerOne);
                worldOne.start();
            }

            case 2 -> {
                LevelTwo worldTwo = new LevelTwo();

                currentStudent = worldTwo.getStudent();

                view.setWorld(worldTwo);
                StudentController controllerTwo = new StudentController(currentStudent);
                view.addKeyListener(controllerTwo);
                worldTwo.start();
            }

            case 3 -> {
                LevelThree worldThree = new LevelThree();

                currentStudent = worldThree.getStudent();

                view.setWorld(worldThree);
                StudentController controllerThree = new StudentController(currentStudent);
                view.addKeyListener(controllerThree);
                worldThree.start();
            }
        }
    }

    public void unloadLevel(GameView view) {
        view.getWorld().stop();
    }

    public void setCurrentLevel(int newLevelNumber) {
        levelNumber = newLevelNumber;

        unloadLevel(Game.getView());
        loadLevel(Game.getView(), levelNumber);
    }

    public void ResetLevel() {

        ArrayList<Flipper> collectedFlippers = currentStudent.getCollectedFlippers();
        collectedFlippers.stream().filter(n -> !n.getState()).forEach(n -> n.setState(false));
        currentStudent.setCollectedFlippers(collectedFlippers);
    }

    public void DeadStudent() {
        setCurrentLevel(1);
    }
}
