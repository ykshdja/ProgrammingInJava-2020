
package assignment7;
import java.util.Scanner;

/**
 * Tims Order -
 * This class represent the order
 *
 *
 * @author  Yash Khanduja, 000826385
 *
 *
 */
public class TimsOrder{
    // private variables
    private int size; //It holds the total no. of customer orders list
    private String customerName; //It holds the Customer Name
    private assignment7.TimsProduct[] customersOrder; //It holds the customers Order list
    static Scanner sc = new Scanner(System.in); // scanner objects to read user input

    /*
     * Private Constructor
     * @param customerName
     * @param size that is number of orders
     */
    private TimsOrder(String customerName, int size) {
        this.size = size;
        this.customerName = customerName;
        customersOrder = new assignment7.TimsProduct[size];
        int counter = 0;
        while(counter<this.size){
            /// read choice of products
            System.out.println("Which type of product you want:");
            System.out.println("1. BoxOfNails\n2. NailGun\n3. Hammer\n4. Glue\n Enter your choice:");

            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    BoxOfNails bn = BoxOfNails.create();
                    customersOrder[counter]=bn;
                    counter++;
                    break;
                case 2:
                    NailGun ng = NailGun.create();
                    System.out.println("You want to Buy or Rent?\nFor Rent Press 1\nFor Buy Press 2\nPress Any One Option:");
                    option=sc.nextInt();
                    if(option==1){
                        ng.rent();
                    }

                    customersOrder[counter]=ng;
                    counter++;
                    break;
                case 3:
                    Hammer hammer=Hammer.create();
                    customersOrder[counter]=hammer;
                    counter++;
                    break;
                case 4:
                    Glue glue=Glue.create();
                    customersOrder[counter]=glue;
                    counter++;
                    break;
                default:
                    System.out.println("Invalid Choice...");
                    break;
            }

        }
    }

    /*
     *It returns the Order object
     * @return TimsOrder
     */
    public static TimsOrder create(){
        System.out.println("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.println("How many products you want to add:");
        int size = sc.nextInt();

        TimsOrder timsOrder =  new TimsOrder(customerName,size);
        return timsOrder;
    }

    /*
     *It returns total amount
     * @return double amount to be paid
     */
    public double getAmountDue(){
        double sum = 0.0;

        for(assignment7.TimsProduct timsProduct: customersOrder){
            if(timsProduct instanceof assignment7.RentableHardware){
                NailGun ng = (NailGun)timsProduct;
                sum += ng.getRetailPrice();
                if(ng.isRented()){
                    sum = sum + ng.getRentalCost();
                }
            }else if(timsProduct instanceof BoxOfNails){
                BoxOfNails bn = (BoxOfNails)timsProduct;
                sum += bn.getRetailPrice();
            }
        }

        return sum;
    }

    /*
     * String representation of the object
     * return String
     */
    @Override
    public String toString(){
        String output = "Order for:"+customerName+"\n";
        for(assignment7.TimsProduct timsProduct: customersOrder){
            output = output.concat(timsProduct.toString());
        }
        return output;
    }
}
