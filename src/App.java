
public class App {

  public static void main(String[] args) {
    Deck deck = new Deck();
    Player player1 = new Player("player1");
    Player player2 = new Player("player2");
    deck.shuffle();
    for (int i = 0; i < 52; i++) {
      if (i % 2 == 0) {
          player1.draw(deck);
      } else {
          player2.draw(deck);
      }
  }
    for (int i = 0; i < 26; i++) {

      Card card1 = player1.flip();
      Card card2 = player2.flip();
      if(card1.getValue() > card2.getValue()) {
        player1.incrementScore();
        System.out.println(player1.getName()+ " scored");
      }
      else if(card1.getValue() < card2.getValue()) {
        player2.incrementScore();
        System.out.println(player2.getName()+ " scored");
      }
      else {
        System.out.println("It's a draw");
      }
    }
    
    System.out.println();
    System.out.println(player1.getName()+ " score is " + player1.getScore());
    System.out.println(player2.getName()+ " won with " + player2.getScore());
    System.out.println();
    
    if(player1.getScore() > player2.getScore()) {
      System.out.println(player1.getName()+ " won with " + player1.getScore());
    }
    else if(player1.getScore() < player2.getScore()) {
      System.out.println(player2.getName()+ " won with " + player2.getScore());
    } 
    else {
      System.out.println("It's a draw ");
    }


  }

}
