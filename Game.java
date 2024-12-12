public class Game {
  Player p;
  Dice d;

  Game() {
    p = new Player();
    d = new Dice();
  }
  
  void start() {
    p.turn(d);
    System.out.println(d.me);
    judge();
  }

  void judge() {
    if (d.me == 6) {
      System.out.println("当たり");
    }
    else {
      System.out.println("はずれ");
    }
  }
}
