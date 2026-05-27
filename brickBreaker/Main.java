
import javax.swing.JFrame;
import java.awt.GraphicsEnvironment;

public class Main {
    public static void main(String[] args) {
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("No graphical display available. This game requires a GUI environment.");
            return;
        }

        // Get the screen size
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        int screenWidth = ge.getMaximumWindowBounds().width;
        int screenHeight = ge.getMaximumWindowBounds().height;

        // Check if the screen size is sufficient for the game
        if (screenWidth < 700 || screenHeight < 600) {
            System.out.println("Screen size is too small to run the game. Please use a larger display.");
            return;
        }

        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        obj.setVisible(true);
    }
}