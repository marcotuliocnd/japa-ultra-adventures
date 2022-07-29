import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;

public class DisplayManager extends Canvas {
  public static int WIDTH = 1024;
  public static int HEIGHT = 768;
  public static int MAX_FPS = 30;

  private JFrame jFrame = new JFrame("Japa Ultra Adventures");

  public DisplayManager (GameManager gameManager) {
    this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    this.addKeyListener(gameManager);

    this.jFrame.setResizable(false);
    this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.jFrame.add(this);
    this.jFrame.pack();
    this.jFrame.setVisible(true);
    this.jFrame.setLocationRelativeTo(null);
    System.out.println("> DisplayManager started");
  }
}
