public class Card {private String suit;
    private String rank;

    public Card()
    {}
    /*
    The switch statement is used to determine the face value of the card
     */
    public Card(String suit,String rank)
    {
        this.suit=suit;
        switch(rank)
        {
            case "2" :
                this.rank ="Two";
                break;
            case "3" :
                this.rank = "Three";
                break;
            case "4":
                this.rank = "Four";
                break;
            case "5":
                this.rank = "Five";
                break;
            case "6":
                this.rank ="Six";
                break;
            case "7":
                this.rank ="Seven";
                break;
            case "8":
                this.rank = "Eight";
                break;
            case "9":
                this.rank ="Nine";
                break;
            case "10" :
                this.rank = "Ten";
                break;
            default:this.rank = rank;
        }

    }

    public String getSuit() { return suit; }

    public String getRank() { return rank; }

    /*
    the setCard method is used to set a face value of a card when it is called.
     */

    public void setCard(String suit,String rank)
    {
        this.suit = suit;
        switch(rank)
        {
            case "2" :
                this.rank ="Two";
                break;
            case "3" :
                this.rank = "Three";
                break;
            case "4":
                this.rank = "Four";
                break;
            case "5":
                this.rank = "Five";
                break;
            case "6":
                this.rank ="Six";
                break;
            case "7":
                this.rank ="Seven";
                break;
            case "8":
                this.rank = "Eight";
                break;
            case "9":
                this.rank ="Nine";
                break;
            case "10" :
                this.rank = "Ten";
                break;
            default:this.rank = rank;
        }
    }
    /*
    The toString method puts together the name of the card.
    */
    public String toString() {return rank + " of " + suit;}
}
