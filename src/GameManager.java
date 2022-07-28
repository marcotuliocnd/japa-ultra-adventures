import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameManager implements Runnable, KeyListener {
  private DisplayManager displayManager;

  public GameManager () {
    this.displayManager = new DisplayManager(this);
    System.out.println("> GameManager started");
  }

  private void render () {

  }

  private void tick () {

  }

  public void run () {
    while (true) {
      this.displayManager.requestScreenFocus();
      this.tick();
      this.render();

      try {
        Thread.sleep(1000 / 30);
      } catch (Exception err) {
        err.printStackTrace();
      }
    }
  }

  public void keyTyped(KeyEvent event) {}

  public void keyPressed(KeyEvent event) {
    System.out.println(event.getKeyCode());
  }

  public void keyReleased(KeyEvent event) {
  }
}