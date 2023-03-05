package game;

import javax.swing.JFrame;

/**
 * Your main game entry point
 */
public class Game {


    /** Initialise a new Game. */
    public Game() {

        //1. make an empty game world
        LevelOne world = new LevelOne();

        //2. populate it with bodies (ex: platforms, collectibles, characters)

        //3. make a view to look into the game world
        // UserView view = new UserView(world, 500, 500);
        GameView view = new GameView(world, 500, 500);

        StudentController controller = new StudentController(world.getStudent());
        view.addKeyListener(controller);


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
       //  JFrame debugView = new DebugViewer(world, 500, 500);

        // start our game world simulation!
        world.start();

        view.requestFocus();
    }

    /** Run the game. */
    public static void main(String[] args) {

        new Game();
    }
}
