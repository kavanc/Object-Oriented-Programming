import java.util.Random;
public class DeckOfCards {private Card cards[];
    private int cardsRemaining;
    /*
The DeckOfCards class uses for loops to find remaining cards.
    */
    public DeckOfCards()
    {
        cardsRemaining = 0;
        String suit[] = {"Hearts","Spades","Clubs","Diamonds"};
        String face[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        cards = new Card[suit.length*face.length];
        for(int i = 0; i < suit.length; i++)
        {
            for(int j = 0; j < face.length; j++)
            {
                cards[cardsRemaining] = new Card(suit[i],face[j]);
                cardsRemaining++;
            }
        }
    }
    /*
    A constructor is created to assign new values to the variable cards.
     */
    public DeckOfCards(int n)
    {
        cards = new Card[n];
        cardsRemaining = n;
        for(int i = 0; i < n; i++)
            cards[i] = new Card();
    }
/*
the setCard method is called to set the value of the card
 */
    public void setCard(int index, String suit, String face)
    {
        if(index >= 0 && index < cards.length)
            cards[index].setCard(suit, face);
    }
    /*
    The shuffle method utilises a for loop with an inner if statement
    to shuffle the deck of cards by picking two random cards from the deck
    then using an if statement to compare the values and if they are not
    equivalent the values are swapped. This changes the spot in the array
    that the values are located, therefore, shuffling the cards.
     */

    public void shuffle()
    {
        Random rand = new Random();
        int c1, c2;
        for(int i = 0; i <= cards.length/2; i++)
        {
            c1 = rand.nextInt(cards.length);
            c2 = rand.nextInt(cards.length);

            if(c1 != c2)
            {
                Card temp = cards[c1];
                cards[c1] = cards[c2];
                cards[c2] = temp;
            }
        }
    }
    /*
    The deal method calls the Card class to reduce the cards remaining in the deck
    and give the card at the top of the deck.
    */
    public Card deal()
    {
        cardsRemaining--;
        return cards[cardsRemaining];
    }

    public int getCardsRemaining()
    {
        return cardsRemaining;
    }
    //The method handScore uses a for loop with internal if, else if and else statements;
    //to find the value of the cards and adds the value of the cards together.


    public int handScore()
    {
        int score = 0;
        for(int i=0;i<cardsRemaining;i++)
        {
            if(cards[i].getRank().equalsIgnoreCase("Ace"))
                score += 1;
            else if(cards[i].getRank().equalsIgnoreCase("Two"))
                score += 2;
            else if(cards[i].getRank().equalsIgnoreCase("Three"))
                score += 3;
            else if(cards[i].getRank().equalsIgnoreCase("Four"))
                score += 4;
            else if(cards[i].getRank().equalsIgnoreCase("Five"))
                score += 5;
            else if(cards[i].getRank().equalsIgnoreCase("Six"))
                score += 6;
            else if(cards[i].getRank().equalsIgnoreCase("Seven"))
                score += 7;
            else if(cards[i].getRank().equalsIgnoreCase("Eight"))
                score += 8;
            else if(cards[i].getRank().equalsIgnoreCase("Nine"))
                score += 9;
            else
                score += 10;
        }

        return score;
    }
    //the printSuitHist method uses a for loop to set all the values of the suits to 0.
    // the for loop that holds the if, else if and else statements adds value to the array which holds the suits
    // the for loops that follow add the amount of stars for each of the time the hand holds a specific suit.

    public void printSuitHist()
    {

        // 0 - Hearts, 1 - Spades, 2 - Clubs, 3 - Diamonds
        int suitCards[] = new int[4];
        for(int i = 0; i < suitCards.length; i++)
            suitCards[i] = 0;

        for(int i = 0; i < cardsRemaining; i++)
        {
            if(cards[i].getSuit().equalsIgnoreCase("Hearts"))
                suitCards[0]++;
            else if(cards[i].getSuit().equalsIgnoreCase("Spades"))
                suitCards[1]++;
            else if(cards[i].getSuit().equalsIgnoreCase("Clubs"))
                suitCards[2]++;
            else suitCards[3]++;

        }

        System.out.println("Suit Histogram: ");
        System.out.print("Hearts : ");
        for(int i = 0; i < suitCards[0]; i++)
            System.out.print("*");
        System.out.print("\nSpades : ");
        for(int i = 0; i < suitCards[1]; i++)
            System.out.print("*");
        System.out.print("\nClubs : ");
        for(int i = 0; i < suitCards[2]; i++)
            System.out.print("*");
        System.out.print("\nDiamonds : ");
        for(int i = 0; i < suitCards[3]; i++)
            System.out.print("*");
        System.out.println();
    }
    //the hasFlush method uses a for loop to clear the array called suitCards
    //the for loop with if, else if, and else  statements adds the number of a single suit in the hand to the array for the suits.
    //the last for loop checks to see if the number of any of the suits in the hand are 5.

    public boolean hasFlush()
    {
        // create an array of size 4 to store the counts of cards for each suit
        // 0 - Hearts, 1 - Spades, 2 - Clubs, 3 - Diamonds
        int suitCards[] = new int[4];
        for(int i = 0; i < suitCards.length; i++)
            suitCards[i] = 0;

        for(int i = 0; i < cardsRemaining; i++)
        {
            if(cards[i].getSuit().equalsIgnoreCase("Hearts"))
                suitCards[0]++;
            else if(cards[i].getSuit().equalsIgnoreCase("Spades"))
                suitCards[1]++;
            else if(cards[i].getSuit().equalsIgnoreCase("Clubs"))
                suitCards[2]++;
            else suitCards[3]++;

        }

        for(int i = 0; i < suitCards.length; i++)
            if(suitCards[i] == 5)
                return true;

        return false;
    }



}
