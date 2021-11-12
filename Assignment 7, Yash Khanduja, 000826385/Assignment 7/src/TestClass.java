
package assignment7;

/**
 * Test Class
 * This class contains main method to test the program
 *
 *
 * @author  Yash Khanduja, 000826385
 *
 *
 */
public class TestClass {
    // main method
    public static void main(String[] args){
        // TimsOrder create method call
        assignment7.TimsOrder timsOrder = assignment7.TimsOrder.create();
        System.out.println(timsOrder);
        // print total price
        System.out.println("Total Price: $"+timsOrder.getAmountDue());
    }
}
