
package assignment7;

import static assignment7.TimsOrder.sc;

/**
 * Glue -
 * Sticky glue being sold
 *
 *
 * @author Yash Khanduja, 000826385
 */
public class Glue extends assignment7.TimsProduct {

    private double qty; // quantity of glue



    /*
     * Private Constructor
     * @param name  of the Glue
     * @param qty in liters of Glue
     * @param cost of the Glue
     * @param price of the Glue
     */
    private Glue(String name, double qty,double cost, double price) {
        super(name, cost, price);
        this.qty = qty;
    }


    /*
     * Method to create Glue
     *
     */
    public static Glue create(){
        sc.nextLine();
        // read name
        System.out.println("Enter Name of Product:");
        String name = sc.nextLine();
        // read quantity
        System.out.println("Enter Quantity of Glue in liters:");
        double quantity = sc.nextDouble();
        // read Production Cost
        System.out.println("Enter Production Cost:");
        double cost = sc.nextDouble();
        // read Retail Price
        System.out.println("Enter Retail Price:");
        double price = sc.nextDouble();
        return new Glue(name, quantity, cost, price);
    }

    /*
     *Quantity of Glue
     *@return qty
     */
    public double getQty() {
        return qty;
    }

    /*
     * String representation of the object
     * return String
     */
    @Override
    public String toString() {
        return super.toString()+"\tType... Glue{Quantity in liters=" + qty + "}\n";
    }

}
