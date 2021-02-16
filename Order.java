
/**
 * The order class is a class that holds order information
 *
 * @author Kwinn Danforth
 * @version 1.0.01
 */
public class Order
{
    private int customerID;
    
    private int orderNumber;
    private String design;
    private int numOfFeatures;
    private int basePrice;
    private int featuresPrice;
    private int totalPrice;

    /**
     * Constructor for objects of class Order
     */
    public Order(int customerID, int orderNumber, String design, int numOfFeatures)
    {
        this.customerID = customerID;
        this.orderNumber = orderNumber;
        if (numOfFeatures >= 1 && numOfFeatures <= 5){
        this.numOfFeatures = numOfFeatures;
        } else {
            System.out.println("Error! Sorry, you must choose between 1 and 5 features");
        }
        if (design == "Nature"){
            this.design = design;
            this.basePrice = 300;
            this.featuresPrice = (numOfFeatures * 5) + 5;
            this.totalPrice = this.basePrice + this.featuresPrice;
        }else if (design == "Tech"){
            this.design = design; 
            this.basePrice = 350;
            this.featuresPrice = (numOfFeatures * 10) + 10;
            this.totalPrice = this.basePrice + this.featuresPrice;
        }else if (design == "Business"){
            this.design = design;
            this.basePrice = 375;
            this.featuresPrice = (numOfFeatures * 10) + 20;
            this.totalPrice = this.basePrice + this.featuresPrice;
        }else if (design == "Music"){
            this.design = design;
            this.basePrice = 400;
            if(numOfFeatures < 3){
                this.featuresPrice = 75 + (numOfFeatures * 10);
            }else if(numOfFeatures < 5){
                if(numOfFeatures == 3){
                    this.featuresPrice = 110;
                }else{
                    this.featuresPrice = 130;
                }
            }else {
                this.featuresPrice = 210;
            }
            this.totalPrice = this.basePrice + this.featuresPrice;
        }else if (design == "Naughty"){
            this.design = design;
            this.basePrice = 500;
            this.featuresPrice = (numOfFeatures * 100);
            this.totalPrice = this.basePrice + this.featuresPrice;
        } else {
             System.out.println("Error! Sorry, you must choose a valid design (Nature, Tech, Business, Music or Naughty)");
        }
    }

    /**
     * This is an accessor method for the order's customerID.
     *
     * @return    customerID.
     */
    public int getCustomerID()
    {
        return this.customerID;
    }
    
    /**
     * This is an accessor method for the order number.
     *
     * @return    orderNumber.
     */
    public int getOrderNumber()
    {
        return this.orderNumber;
    }
    
    /**
     * This is an accessor method for the order's design.
     *
     * @return    design.
     */
    public String getDesign()
    {
        return this.design;
    }
    
    /**
     * This is an accessor method for the number of features included in the order..
     *
     * @return    numOfFeatures.
     */
    public int getNumOfFeatures()
    {
        return this.numOfFeatures;
    }
    
    /**
     * This is an accessor method for the base price for the design of order.
     *
     * @return    basePrice.
     */
    public int getBasePrice()
    {
        return this.basePrice;
    }
    
    /**
     * This is an accessor method for the price of any added features on the order.
     *
     * @return    featuresPrice.
     */
    public int getFeaturesPrice()
    {
        return this.featuresPrice;
    }
    
    /**
     * This is an accessor method for the total price of the order.
     *
     * @return    totalPrice.
     */
    public int getTotalPrice()
    {
        return this.totalPrice;
    }
    
}
