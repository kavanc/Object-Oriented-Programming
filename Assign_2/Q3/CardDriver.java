public class CardDriver {

    public static void main(String[] args)
    {
        //the DeckOfCards class is called
        DeckOfCards deck = new DeckOfCards();
        // the shuffle method is called to shuffle the deck
        deck.shuffle();
        // hand variable takes 5 cards out of the deck
        DeckOfCards hand = new DeckOfCards(5);
        System.out.println("Cards dealt in the hand : ");
        //the for loop sets and outputs 5 cards
        for(int i = 0; i < hand.getCardsRemaining(); i++)
        {
            Card card = deck.deal();
            hand.setCard( i, card.getSuit(), card.getRank());
            System.out.println(card);
        }
        System.out.println();
        //the SuitHist method is called in context of the hand
        hand.printSuitHist();
        System.out.println();
        //the handScore method is called in context of the hand
        System.out.println("Hand score : " + hand.handScore());
        System.out.println();
        //the hasFlush method is called in context of the hand
        System.out.println("Hand is a flush : " + hand.hasFlush());

    }
}
