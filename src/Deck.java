import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {


  List<Card> cards = new ArrayList<Card>();

  public Deck() {

    String[] suits = {"club", "Diamonds", "Hearts", "Spades"};
    String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Jack", "Queen", "King", "Ace"};

    for (String number : numbers) {
      int count = 2;
      for (String suit : suits) {

        Card card = new Card(suit, count);
        this.cards.add(card);
        count++;

      }
    }

  }

  public List<Card> getCards() {
    return cards;
  }

  public void setCards(List<Card> cards) {
    this.cards = cards;
  }

  public void describe() {
    for (Card card : this.cards) {
      card.describe();
    }

  }

  public void shuffle() {
    Collections.shuffle(this.cards);
  }

  public Card draw() {
    return cards.remove(0);
  }

}

