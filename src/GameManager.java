import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameManager implements KeyListener {
  private DisplayManager displayManager;
  public static int fps = 0;

  public GameManager () {
    this.displayManager = new DisplayManager(this);
    System.out.println("> GameManager started");
  }

  private void render () {
    
  }

  private void tick () {

  }

  public void start () {
    this.run();
  }

  public void run () {
    long lastSync = System.nanoTime();
    double ns = 1000000000 / ConfigManager.MAX_FPS;
    double delta = 0;
    double timer = System.currentTimeMillis();

    while (true) {
      long now = System.nanoTime();
      delta += (now - lastSync) / ns;
      lastSync = now;

      if (delta >= 1) {
        this.displayManager.requestFocus();
        this.tick();
        this.render();
        fps += 1;
        delta -= 1;
      }

      if (System.currentTimeMillis() - timer >= 1000) {
        System.out.println("FPS: " + fps);
        fps = 0;
        timer += 1000;
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