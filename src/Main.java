public class Main {
    public static void main(String[] args) {
        //examples();
    }

    static void examples() {
        Deck myDeck = new Deck();
        Hand joe = new Hand();

        myDeck.shuffle();
        //myDeck.printDeck();
        joe.drawCard(myDeck);
        joe.drawCard(myDeck);
        joe.drawCard(myDeck);
        joe.printHand();
    }
    
}