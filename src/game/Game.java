package game;

import game.levels.LevelZero;

import javax.swing.*;

/**
 * Your main game entry point
 */
public class Game {


    private static LevelManager mainLevel;
    private static GameView view;

    /**
     * Initialise a new Game.
     */
    public Game() {
        LevelZero initLevel = new LevelZero();

        mainLevel = new LevelManager();

        view = new GameView(initLevel, 800, 480);
        mainLevel.loadLevel(view, 0);

        GiveFocus focusChecker = new GiveFocus(view);
        view.addMouseListener(focusChecker);
        //4. create a Java window (frame) and add the game
        //   view to it
        final JFrame frame = new JFrame("Phase Switch");
        frame.add(view);

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);

        //optional: uncomment this to make a debugging view
        // JFrame debugView = new DebugViewer(view.getWorld(), 500, 500);
        // view.setGridResolution(1);

        view.requestFocus();
    }

    /**
     * Run the game.
     */
    public static void main(String[] args) {
        new Game();
    }

    public static GameView getView() {
        return view;
    }

    public static LevelManager getLevelManager() {
        return mainLevel;
    }
}