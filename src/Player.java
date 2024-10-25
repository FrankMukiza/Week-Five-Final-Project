import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;
    private String name;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }
    
    public String getName() {
      return this.name;
    }

    // Describe method
    public void describe() {
        System.out.println("Player: " + name + " - Score: " + score);
        for (Card card : hand) {
            card.describe();
        }
    }

    // Flip method
    public Card flip() {
        return hand.remove(0);
    }

    // Draw method
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    // Increment Score
    public void incrementScore() {
        score++;
    }

    // Getter for score
    public int getScore() {
        return score;
    }
}
