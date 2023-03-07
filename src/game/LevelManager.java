package game;

import city.cs.engine.StepListener;
import game.levels.LevelOne;
import game.levels.LevelThree;
import game.levels.LevelTwo;
import game.levels.LevelZero;
import org.jetbrains.annotations.NotNull;

public class LevelManager {
    int levelNumber;

    public LevelManager() {

    }

    public void loadLevel(GameView view, int levelToBe) {
        view.getWorld().stop();
        switch (levelToBe) {
            case 0 -> {
                LevelZero worldZero = new LevelZero();
                view.setWorld(worldZero);
                StudentController controller = new StudentController(worldZero.getStudent());
                view.addKeyListener(controller);
                worldZero.start();
            }
            case 1 -> {
                LevelOne worldOne = new LevelOne();
                view.setWorld(worldOne);
                StudentController controllerOne = new StudentController(worldOne.getStudent());
                view.addKeyListener(controllerOne);
                worldOne.start();
            }

            case 2 -> {
                LevelTwo worldTwo = new LevelTwo();
                view.setWorld(worldTwo);
                StudentController controllerTwo = new StudentController(worldTwo.getStudent());
                view.addKeyListener(controllerTwo);
                worldTwo.start();
            }

            case 3 -> {
                LevelThree worldThree = new LevelThree();
                view.setWorld(worldThree);
                StudentController controllerThree = new StudentController(worldThree.getStudent());
                view.addKeyListener(controllerThree);
                worldThree.start();
            }
        }
    }

    public void unloadLevel(@NotNull GameView view) {
        view.getWorld().stop();
    }

    public void setCurrentLevel(int newLevelNumber) {
        unloadLevel(Game.getView());
        loadLevel(Game.getView(), newLevelNumber);
        levelNumber = newLevelNumber;
    }

}
