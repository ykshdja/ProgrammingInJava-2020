
import java.util.Scanner;
import static java.lang.System.exit;

public class MainTest {
    public static void main(String[] args) {
        //Input How many Cards to Deal
        int howManyCardsDealone = 0;
        int howManyCardsDealtwo = 0;
        //Quit Input
        int quit = 1;
        int userOption = 0;
        int userInmaxRank = 0;
        int userInNoSuit = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Ranks:");
        String usermaxRank = scanner.next();//Input Max Rank.
          userInmaxRank = Integer.parseInt(usermaxRank);


        System.out.println("How many Suits:");
        String userNoSuit = scanner.next();//Input Suit Number.
        userInNoSuit = Integer.parseInt(userNoSuit);
        //Object Creation
        DeckOfCards d = new DeckOfCards(userInmaxRank,userInNoSuit);

        System.out.println(d.toString());
        userOption = scanner.nextInt();

        while (userOption != 4) {
            if (userOption == 1) {
                System.out.println(" Cards Shuffled\n");
                d.shuffle();


            } else if (userOption == 2) {
                System.out.println("Deal One Hand\n");
                System.out.println("How many Cards to Deal:");
                howManyCardsDealone = scanner.nextInt();
                d.dealMoreThanOneCard(howManyCardsDealone);


            } else if (userOption == 3) {
                System.out.println("Deal 100,000 Hands");
                System.out.println("How Many Cards:");
                howManyCardsDealtwo = scanner.nextInt();
                d.histogram(howManyCardsDealtwo);

            } else if (userOption == 4) {
                System.out.println("Quit\n");
                exit(0);
            }

            System.out.println(d.toString());
            System.out.println("Please Enter One Of The Options:");
            userOption = scanner.nextInt();
        }




            }



    }

