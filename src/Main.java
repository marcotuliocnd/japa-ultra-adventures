public class Main {
  public static void main (String args[]) {
    System.out.println("> Starting game");
    GameManager gameManager = new GameManager();
    new Thread(gameManager).start();
  }
}