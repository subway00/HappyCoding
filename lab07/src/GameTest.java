public class GameTest {
   public static void main(String[] args) {
   Game game = new Game();
   game.choose();
   System.out.println(game.countTimes());
   game.display();
   game.find();
}
}
