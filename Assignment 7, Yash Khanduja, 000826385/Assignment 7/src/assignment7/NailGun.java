
package assignment7;
import static assignment7.TimsOrder.sc;

/**
 * Nail Gun
 * Nail gun is a rentable hardware being sold
 *
 *
 * @author - Yash Khanduja, 000826385
 *
 *
 */
public class NailGun extends assignment7.RentableHardware {
    // private variables
    private String features; //It holds the features of product
    private int caliber;
    /**
     * Private constructor 
     * @param name of the gun
     * @param features of the gun
     * @param rentalcost of the gun
     * @param cost of the gun
     * @param price of the gun
     * @param caliber of the gun
     *
     */
    private NailGun(String name, String features,double rentalCost, double cost, double price, int caliber ){
        super(name,rentalCost,cost,price);
        this.features = features;
        this.caliber =caliber ;
    }

    /**
     * To create nail gun object
     * @return NailGun
     */
    public static NailGun create(){
        sc.nextLine();
        // read name
        System.out.println("Enter Name of Product:");
        String name = sc.nextLine();
        // read features
        System.out.println("Enter Features:");
        String features = sc.nextLine();
        // read caliber
        System.out.println("Enter caliber:");
        int caliber = sc.nextInt();
        // read production cost
        System.out.println("Enter Production Cost:");
        double cost = sc.nextDouble();
        // read retail price
        System.out.println("Enter Retail Price:");
        double price = sc.nextDouble();

        System.out.println("Enter Rental Cost:");
        double rentalCost = sc.nextDouble();
        return new NailGun(name, features, rentalCost, cost, price,caliber);

    }

    /*
     *To get nail gun featuress
     *@return freatures
     */
    public String getFeatures(){
        return features;
    }


    /*
     * String representation of the object
     * return String
     */
    @Override
    public String toString(){
        return super.toString()+"\tType... RentableHardware{rentalCost="+rentalCost+", rented="+rented+"}\n\tType... NailGun{features=\""+features+"\" , caliber=\""+caliber+"\"}\n";
    }
}