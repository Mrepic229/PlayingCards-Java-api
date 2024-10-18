import java.util.*;

public class Hand {
    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void drawCard(Deck deck) {
        hand.add(deck.popTop());
    }

    public void printHand() {
        for (int i = 0; i < hand.size(); i++) {
            System.out.print(""+ i + ". ");
            hand.get(i).printCard();
        }
    }

    public Card playCard(int index) {
        Card result = hand.get(index);
        hand.remove(index);

        return result;

    }

}
