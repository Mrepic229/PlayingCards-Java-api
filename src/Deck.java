import java.util.*;
import java.io.*;

public class Deck {
    ArrayList<Card> Deck;

    public Deck() {
        Deck = new ArrayList<Card>();
        for (int i = 0; i < Suit.values().length; i++) {
            for (int j = 0; j < Value.values().length; j++) {
                Deck.add(new Card(Suit.values()[i], Value.values()[j]));
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < 100; i++) {
            switchTwoCards((int)(Math.random() * Deck.size()), (int)(Math.random() * Deck.size()));
        }
    }

    public void printDeck() {
        for (int i = 0; i < Deck.size(); i++) {
            Deck.get(i).printCard();
        }
    }
    
    void switchTwoCards(int index1, int index2) {
        Card temp = Deck.get(index1);
        Deck.set(index1, Deck.get(index2));
        Deck.set(index2, temp);
    }
}
