
package assignment7;

import static assignment7.TimsOrder.sc;

/**
 * Hammer -
 * Hammer product
 *
 *
 * @author Yash Khanduja, 000826385
 *
 *
 */
public class Hammer extends assignment7.TimsProduct {

    private double length; // The length of hammer
    private String metalType; //The type of hammer wooder, iron , etc



    /*
     * Private Constructor
     * @param name  of the item
     * @param length of the hammer
     * @param metalType of the hammer
     * @param cost of the hammer
     * @param price of thehammer
     */
    private Hammer(String name, double length, String metalType, double cost, double price) {
        super(name, cost, price);
        this.length = length;
        this.metalType = metalType;
    }


    /*
     * Method to Mammer object
     *
     */
    public static Hammer create(){
        sc.nextLine();
        // read name
        System.out.println("Enter Name of Product:");
        String name = sc.nextLine();
        // read size
        System.out.println("Enter length:");
        double length = sc.nextDouble();

        // metal type
        System.out.println("Enter metal type:");
        String metalType = sc.nextLine();
        metalType = sc.nextLine();

        // read Production Cost
        System.out.println("Enter Production Cost:");
        double cost = sc.nextDouble();
        // read Retail Price
        System.out.println("Enter Retail Price:");
        double price = sc.nextDouble();
        return new Hammer(name, length, metalType, cost, price);
    }

    /*
     *Length of hammer
     *@return length
     */
    public double getLength() {
        return length;
    }

    /*
     *Metal type of hammer
     *@return metalType
     */
    public String getMetalType() {
        return metalType;
    }

    /*
     * String representation of the object
     * return String
     */
    @Override
    public String toString() {
        return super.toString()+"\tType... Hammer{Lenght=" + length + ", Metal Type=" + metalType + "}\n";
    }

}

