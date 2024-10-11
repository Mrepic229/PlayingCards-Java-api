import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        for (int i = 0; i < Suit.values().length; i++) {
            for (int j = 0; j < Value.values().length; j++) {
                deck.add(new Card(Suit.values()[i], Value.values()[j]));
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < 100; i++) {
            switchTwoCards((int)(Math.random() * deck.size()), (int)(Math.random() * deck.size()));
        }
    }

    public void printDeck() {
        for (int i = 0; i < deck.size(); i++) {
            deck.get(i).printCard();
        }
    }
    
    void switchTwoCards(int index1, int index2) {
        Card temp = deck.get(index1);
        deck.set(index1, deck.get(index2));
        deck.set(index2, temp);
    }

    public Card popTop() {
        Card result = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);

        return result;
    }

}
