import java.util.Random;
import java.util.Arrays;

/**
 * DeckOfCards declares s object holds a set of Card objects in an array.
 */

public class DeckOfCards {
    private Card[] deck; //Array of Card Objects.
    Random randNum= new Random();
    private int maxRank; //Maximum Rank.
    private int noSuit;  // Maximum Number of Suit.
    private int currentCard = 1;
    int maxValOfCards = maxRank*noSuit;
    // Instance of Card Class
     Card valOfCard = new Card(maxRank,noSuit);
    /***
     * @Constructor defines the number of cards in the array.
     * populate the Deck with card objects -> S1R1,S1R2,S1R3...
     * @param maxRank Argument.
     * @param noSuit Argument.
     */

    /**
     *
     * @return private Instance Variable
     */
   public int getMaxRank()
   {
       return maxRank;
   }
   public int getNoSuit()
   {
       return noSuit;
   }
    public DeckOfCards (int maxRank, int noSuit)
    {
        deck = new Card[maxRank*noSuit]; //Create array of Card Objects.
        //Populate the Array,Initialize all the Cards.
        int i = 0;
        for(int s = 1;s <=noSuit;s++)
        {
            for(int r = 1;r<=maxRank;r++)
            {
                deck[i++] = new Card(r,s);
            }
        }

    }// End of the Constructor.
    public Card[] getDeck()
    {
        return deck;
    }

    /**
     * @param: None
     * @return: None
     * Shuffle: Shuffles the Card
     *
     */
    public void shuffle()
    {
        currentCard = 0;
        Card temp = new Card(1,1);

        for(int i=0;i<deck.length;i++)
        {
            int swap = randNum.nextInt(deck.length);
            temp = deck[i]; //Swap Algorithm
            deck[i] = deck[swap];
            deck[swap] = temp;
        }
    }//End of Shuffle

    /**
     *
     * @return Length or Size of the Deck
     */
    public int getSize()
    {
        return deck.length;
    }

    /**
     *
     * @return Minimum Card Value that is 1.
     */
    public int getMinimum()
    {
        return 1;
    }

    /**
     *
     * @return Maximum Value of the Card.
     */
    public int getMaximum()
    {
        int max_Val = deck[0].getValue();//Initialize to the first index of the deck
        //Enhanced For Loop for Traversal Over the Array
        for(Card c:deck)
        {
            //Compare Every value in Array with the First Value.
            if(c.getValue()>max_Val)
            {
                max_Val = c.getValue();
            }
        }
        return max_Val;
    }

    /**
     * @Method: To Deal one Card
     * @return
     */
    public Card dealOneCard()
    {
        if(currentCard<deck.length)
        {
            return deck[currentCard++];
        }
        else
        {
            return null;
        }
    }

    /**
     *
     * @param n
     * @return An Array dealtCard.
     */
    public Card[] dealMoreThanOneCard(int n)
    {   int j;
        Card[] dealtCard = new Card[n];
        for( j=0 ;j<n ;j++)
        {
            dealtCard[j] = deck[j];
        }

        for(int i=0;i<n;i++) // We are NOT Supposed to Do this!!
        {
            System.out.println(dealtCard[i]);
        }
        return dealtCard;
    }

    /**
     *
     * @param
     * @return
     */
   /* public int[] histogram(int x)
    {   DeckOfCards myDeck = new DeckOfCards(maxRank,noSuit);
        int totValOfCardsDealt = 0;
        //Frequency Array
        int frequency[] = new int[maxValOfCards];
        // Array Used to Equate dealtCard.
        Card[] cardsInHand = new Card[x];

        for(int k=0;k<100000;k++)
        {
            myDeck.shuffle();
        }
        myDeck.dealMoreThanOneCard(x);
        cardsInHand = myDeck.dealMoreThanOneCard(x);
        // Add the Value of Array Elements
        for(int j=0;j<x;j++)
        {
            totValOfCardsDealt+=cardsInHand[j].getValue();
        }

          frequency[totValOfCardsDealt] = 1;
        for(int k=0;k<x;k++)
        {
            System.out.println(frequency[k]);
        }
        return frequency;

    }*/
    public int[] histogram(int noOfCards_hist)
    {
        int [] arrCounter = new int[maxRank*noSuit*noSuit];
        for(int k=1;k<100000;k++)
        {
            shuffle();
        }
        int valInCard = 0;
        for(int j=0;j<noOfCards_hist;j++)
        {
            valInCard = valInCard+(deck[j].getRank()*deck[j].getSuit());
        }
            arrCounter[valInCard]+= 1;
        for(int j=0;j<noOfCards_hist;j++)
        {
            System.out.println(arrCounter[j]);
        }
        return arrCounter;
    }

    /**
     *
     * @return String Representation of in Main
     */
    public String toString ()
    {
        System.out.println("Shuffle = 1");
        System.out.println("Deal One Hand = 2");
        System.out.println("Deal 100,000 Hands = 3");
        System.out.println("Quit = 4");
        return "Deck of " + getMaximum()+" Cards" + "\ncards: Low = "+ getMinimum()+ " \nHigh = " + getMaximum()+"\nTop = Card " + deck[0];
    }

}
