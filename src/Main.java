public class Main {
    public static void main(String[] args) {
        //examples();
    }

    static void examples() {
        Deck myDeck = new Deck();
        Player joe = new Player();

        myDeck.shuffle();
        //myDeck.printDeck();
        joe.drawCard(myDeck);
        joe.drawCard(myDeck);
        joe.drawCard(myDeck);
        joe.printHand();
    }
    
}