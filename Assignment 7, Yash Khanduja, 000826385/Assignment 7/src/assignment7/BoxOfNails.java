
package assignment7;
import static assignment7.TimsOrder.sc;
/**
 * BoxOfNails -
 * The product Item representing box of nail
 *
 *
 * @author  Yash Khanduja, 000826385
 *
 *
 */



public class BoxOfNails extends assignment7.TimsProduct {

    private double size; //It holds the size of product
    private int quantity; //It holds the quantity of product


    /*
     * Private Constructor
     * @param name  of the item
     * @param size of the nails
     * @param quantity of the nails box
     * @param cost of the nails box
     * @param price of the nails box
     */
    private BoxOfNails(String name, double size, int quantity, double cost, double price) {
        super(name, cost, price);
        this.size = size;
        this.quantity = quantity;
    }


    /*
     * Method to create Box of Nails
     *
     */
    public static BoxOfNails create(){
        sc.nextLine();
        // read name
        System.out.println("Enter Name of Product:");
        String name = sc.nextLine();
        // read size
        System.out.println("Enter Size:");
        double size = sc.nextDouble();
        // read quantity
        System.out.println("Enter Quantity:");
        int quantity = sc.nextInt();
        // read Production Cost
        System.out.println("Enter Production Cost:");
        double cost = sc.nextDouble();
        // read Retail Price
        System.out.println("Enter Retail Price:");
        double price = sc.nextDouble();
        return new BoxOfNails(name, size, quantity, cost, price);
    }

    /*
     *To get the size of nails
     *@return size of the nails
     */
    public double getSize() {
        return size;
    }

    /*
     *To get the quantity of nails
     *@return quantity of nails
     */
    public int getQuantity() {
        return quantity;
    }

    /*
     * String representation of the object
     * return String
     */
    @Override
    public String toString() {
        return super.toString()+"\tType... BoxOfNails{size=" + size + ", quantity=" + quantity + "}\n";
    }
}
