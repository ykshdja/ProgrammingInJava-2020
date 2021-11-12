
package assignment7;

/**
 * Rentable Hardware
 * Rentable hardware class is type of commodity that is rentable
 *
 *
 * @author  Yash Khanduja, 000826385
 *
 *
 */
public abstract class RentableHardware extends assignment7.TimsProduct implements Rentable {
    protected double rentalCost; //It holds the rentalCost of proudct if customer renting a product
    protected boolean rented = false; //It holds 'true' or 'false' value. When product is rented then the value of rented variable is 'true' otherwise 'false'.

    /*
     * Constructor
     * @param name of the rentable hardware
     * @param rentalCost of the hardware
     * @param cost of the rentable hardware
     * @param price of the rentable hardware
     */
    public RentableHardware(String name, double rentalCost, double cost, double price) {
        super(name, cost, price);
        this.rentalCost = rentalCost;
    }



    /*
     *It returns the rental cost of product
     * @return rentalcost
     */
    public double getRentalCost(){
        return rentalCost;
    }

    /*
     *It is overridden method which set the rented variable 'true' when customer renting a product
     *
     */
    @Override
    public void rent() {
        rented = true;
    }

    /*
     *It is overridden method which set the rented variable  'false' when customer returning a renting product
     */
    @Override
    public void _return() {
        rented = false;
    }

    /*
     * String representation of the object
     * return String
     */
    @Override
    public boolean isRented() {
        return rented;
    }
}
