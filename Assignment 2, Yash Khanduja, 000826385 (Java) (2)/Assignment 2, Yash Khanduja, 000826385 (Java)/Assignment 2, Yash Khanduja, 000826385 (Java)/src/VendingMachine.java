/*A Vending Machine Program Using OOP Concepts*
*
* @author: Yash Khanduja, 000826385
* @Date:6/21/2020
*
*/

/***
 * The Vending Machine Class creates private instance variable and the
 * appropriate Getters and Setters for making those private instance variable
 * using public methods,This Class is hidden and does not interact with the user
 *
 */


public class VendingMachine {
    // Private Instance Variable
    private String Product_name;
    private double price;
    private int quantity;
    private double unusedCredit;
    private double total_amount = 0;
    private int product_count;
    private double amount;

    // Constructor with Given Arguments,
    public VendingMachine(String Product_name, double price, int quantity) {
        this.Product_name = Product_name;
        this.price = price;
        this.quantity = quantity;
    }

    //To Access the Private Member Variable, We Need Getter and Setter Functions
    //Getter and Setter Methods for Every Private Instance Variable
    public String getProduct_name() { // Getter for Name
        return Product_name;
    }
    /*@param String Product_name
    * @return: None
    * */
    public void setProduct_name(String Product_name) {   // @method setProduct_name Setter for Name
        this.Product_name = Product_name;
    }

    /**
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /* @method getUnusedCredit Initialising Unused credits/Getter Method */
    public double getUnusedCredit() {
        return 0.0;
    }

    /**
     *
     * @param amount
     */
    public void setAmount(double amount) { /** @method setAmount(Double Amount)-Getters and Setter functionality
     */
        total_amount += amount;
    }

    /**
     *
     * @return totalAmount / Unused Credits
     */
    public double getTotalAmount() {
        return this.total_amount;
    }

    /*Method to Reduce the Credits Every Time there is a purchase Made */
    public void setWithdrawal(double amount) {
        total_amount -= amount;
    }

    /**
     *
     * @return Quantity of Item left in the Vending machine after vending
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * @return:None
     * @param: None
     */
    public void reduceQuantity() {
        this.quantity--;
    }


    /*toString Method for String Representation of an Object*/
    public String toString() {

        return "Vending Machine - " + getQuantity() + " " + getProduct_name() + " " + "You have a Credit of " + "$" + getTotalAmount() + " ";

    }

}
