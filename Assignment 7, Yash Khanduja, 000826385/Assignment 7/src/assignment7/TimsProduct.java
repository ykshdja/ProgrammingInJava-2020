
package assignment7;
/**
 * TimsProduct Class
 * This class is the super class main method to test the program
 *
 *
 * @author  Yash Khanduja, 000826385
 *
 *
 */
// class TimsProduct
public abstract class TimsProduct implements Commodity {
    private String name; //It holds the name of product
    private double cost; //It holds the production cost of product
    private double price; //It holds the retial price of product

    /*
     * Tims Product
     *@param name of the product
     *@param cost price of the product
     *@param price retail price of the product
     */
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /*
     *Name of the product
     *@return Name
     */
    public String getName(){
        return name;
    }

    /*
     *Product Cost of the product
     *@return cost
     */
    @Override
    public double getProductionCost() {
        return cost;
    }

    /*
     *Retail price of the product
     *@return price
     */
    @Override
    public double getRetailPrice() {
        return price;
    }
    /*
     * String representation of the object
     * return String
     */
    @Override
    public String toString(){
        return "TimsProduct{name=\""+name+"\", cost="+cost+", price="+price+"}\n";
    }
}

