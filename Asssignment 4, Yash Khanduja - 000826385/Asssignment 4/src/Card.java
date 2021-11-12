/**
 * The Card Class contains two Integer Instance variable - face and suit
 */
public class Card {
   private int rank; //Rank of the Card.
   private int suit; //Suit of the Rank.

   /***
    * @constructor
    * @param rank is the max_Rank of the Cards..
    * @param suit is Number of suits.
    */
   public Card(int rank, int suit)
   {
      this.rank = rank; //Initialize face cards.
      this.suit = suit; //Initialize suit cards.
   }

   /***
    *
    * @return rank
    */
   public int getRank()
   {
      return rank;
   }

   /**
    *
    * @return suit
    */
   public int getSuit()
   {
      return suit;
   }

   /**
    *
    * @return value of the card which is rank multiplied by the suit
    *
    */
   public int getValue()
   {

      return suit*rank;
   }
   public String toString()
   {
      return "S" + getSuit() + "R" + getRank();
   }
}
