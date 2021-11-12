/* A Vending Machine Program Main/View
 *
 * @author: Yash Khanduja, 000826385
 *
 * I Hereby declare that, I have Independently Completed this Assignment
 * */


import java.util.Scanner;

import static javafx.application.Platform.exit;

/**
 * The Main Class Interacts with the User and uses the Functionality of the Model (Vending Machine)
 */
public class MainTest {
    private static VendingMachine machine_1;
    private static VendingMachine machine2;

    /**
     * Main Method Interacts with the User
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);// Basic Input Statement
        VendingMachine a = new VendingMachine("Ice cream", 2.59, 9);// Creating a New Object
        VendingMachine b = new VendingMachine("Chocolate Milkshake", 6.99, 6);//Creating a New Object

        System.out.println("***********************************");
        System.out.println("****WELCOME TO THE BREAK ROOM!!****");
        System.out.println("************************************");

        System.out.println(a.toString());// Printing Using toString Method
        System.out.println(b.toString());//Printing Using toString Method


        System.out.println("***** PLEASE CHOOSE OUT OF THE TWO VENDING MACHINE*****\nWhich machine?");
            int choice = Integer.parseInt(userInput.nextLine());
            while(true)
            {
                if(choice!=1 && choice!=2)
                {
                    System.out.println("Please Enter a Number between 1 and 2 to choose between Two Vending Machines!");
                    choice = Integer.parseInt(userInput.nextLine());
                }
                else
                {
                    break;
                }
            }

        //int choice = Integer.parseInt(userInput.nextLine());
        /*while(choice!=1 || choice!=2)
        {
            System.out.println("Please Enter between 1 and 2");
            choice = userInput.nextInt();

        }*/
        int choiceCounter = -1;
        while (choice != 0) {

            choiceCounter++;
            if (choiceCounter != 0) {
                System.out.println("Which machine?");
                choice = Integer.parseInt(userInput.nextLine());
                if (choice != 1 && choice != 2) {
                    break;
                }

            }
            VendingMachine temp;
            if (choice == 1) {
                temp = a;
            } else {
                temp = b;
            }
            int counter = -1;
            System.out.println("What would you like to do?\n" +
                    "1.Enter money \n" +
                    "2.Get change back \n" +
                    "3.Vend an item \n" +
                    "4.Leave the break room \n" +
                    "Your Choice?");
            int val = Integer.parseInt(userInput.nextLine());// val Asks the user for choice from the above menu
            while (val != 4) {
                counter++;
                double amount;
                System.out.println(temp.toString());

                if (counter != 0) {
                    System.out.println("What would you like to do?\n" +
                            "1.Enter money \n" +
                            "2.Get change back \n" +
                            "3.Vend an item \n" +
                            "4.Leave the break room \n" +
                            "Your Choice?");
                    try {
                        val = Integer.parseInt(userInput.nextLine());
                    } catch (Exception e) {
                        System.out.println("Please Enter an Integer!!");
                    }// Try and Catch for Handling Exceptions
                    //val = Integer.parseInt(userInput.nextLine());
                }
                /*If-Else Ladder for Using Functionality of VendingMachine Class Appropriately*/

                if (val == 1) {
                    System.out.println("Enter the amount");
                    amount = Double.parseDouble(userInput.nextLine());
                    temp.setAmount(amount);


                } else if (val == 2) {
                    if (temp.getTotalAmount() <= 0) {
                        System.out.println("***NO Credits, Add money before Asking for a Change!!***");
                    } else {
                        System.out.println("Enter the amount of change");
                        amount = Double.parseDouble(userInput.nextLine());
                        if (amount > temp.getTotalAmount()) {
                            System.out.println("Sorry, You dont have a credit of $ " + amount + " Can Only Return " + temp.getTotalAmount());
                        } else {
                            temp.setWithdrawal(amount);
                        }
                    }

                } else if (val == 3) {

                    if (temp.getQuantity() > 0 && (temp.getTotalAmount() - temp.getPrice() > 0)) {
                        temp.reduceQuantity();
                        temp.setWithdrawal(temp.getPrice());
                        System.out.println("You vended " + temp.getProduct_name());
                    }
                    if (temp.getQuantity() == 0) {
                        System.out.println("Sorry! Item out of stock, Please Vend Later!!");
                    }
                    if (temp.getTotalAmount() - temp.getPrice() < 0) {
                        System.out.println("***VEND FAIL, Not Enough Credits***");
                    }
                }
                if (val == 4) {
                    a.toString();
                    b.toString();
                    System.out.println("***********************************Thank You for Vending, Good Bye!!*************************************");
                    System.exit(0);
                }

            }

        }

    }
}
