public class Card {

    private Suit suit;
    private Value value;

    public Card() {
        suit = Suit.SPADES;
        value = Value.ACE;
    }

    public Card(Suit s, Value v) {
        suit = s;
        value = v;
    }

    public void printCard() {
        System.out.print(suit);
        System.out.println(" ");
        System.out.println(value);
    }

}

 