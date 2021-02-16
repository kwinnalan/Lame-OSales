import java.util.ArrayList;

/**
 * Class Database is a class to create and store customer and order objects.
 *
 * @author Kwinn Danforth
 * @version 1.0.01
 */
public class Database
{
    private ArrayList<Customer> customers;
    public ArrayList<Order> orders;
    
    /**
     * Constructor for objects of class CustomerDB
     */
    public Database()
    {
       customers = new ArrayList<>();
       orders = new ArrayList<>();
    }

    /**
     * The addCustomer method adds a customer into the database and gives them a unique identifier..
     *
     * @param  customer info; firstName, lastName, company, address, city, state, zipCode, phoneNumber.
     * 
     */
    public void addCustomer(String firstName, String lastName, String company, String address, String city, String state, String zipCode, String phoneNumber)
    {
        int customerID = customers.size() + 10000;
        customers.add(new Customer(customerID, firstName, lastName, company, address, city, state, zipCode, phoneNumber));
       
    }
    
    /**
     * The addOrder method adds an order into the database and gives it a unique identifier.
     *
     * @param  CustomerID, design and number of features.
     * 
     */
    public void addOrder(int customerID, String design, int numOfFeatures)
    {
        int orderNumber = orders.size() + 10000;
        orders.add(new Order(customerID, orderNumber, design, numOfFeatures));
        printBill(orderNumber);
    }
    
    /**
     * Method to return the number of customers in the database.
     * @return The number of customers in the collection.
     */
    public int getNumberOfCustomers()
    {
        return customers.size();
    }
    
    /**
     * Method to return the number of orders in the database.
     * @return The number of orders in the collection.
     */
    public int getNumberOfOrders()
    {
        return orders.size();
    }
    
    /**
     * Print a single customer's info from the database.
     * @param customerID The ID of the customer to be printed.
     */
    public void printCustomer(int customerID)
    {
        int indexNumber = customerID - 10000;
        Customer customer = customers.get(indexNumber);
        System.out.print("\n" + "##Customer ID: " + customer.getCustomerID());
        System.out.print("\n" + "##First Name: " + customer.getFirstName());
        System.out.print("\n" + "##Last Name: " + customer.getLastName());
        System.out.print("\n" + "##Company: " + customer.getCompany());
        System.out.print("\n" + "##Address: " + customer.getAddress());
        System.out.print("\n" + "##City: " + customer.getCity());
        System.out.print("\n" + "##State: " + customer.getState());
        System.out.print("\n" + "##Zip Code: " + customer.getZipCode());
        System.out.print("\n" + "##Phone Number: " + customer.getPhoneNumber());
    }
    
    /**
     * Print a single order's info from the database.
     * @param order number, The number of the order to be printed.
     */
    public void printOrder(int orderNumber)
    {
        int indexNumber = orderNumber - 10000;
        Order order = orders.get(indexNumber);
        System.out.print("\n" + "##Customer ID: " + order.getCustomerID());
        System.out.print("\n" + "##Order Number: " + order.getOrderNumber());
        System.out.print("\n" + "##Design: " + order.getDesign());
        System.out.print("\n" + "##Number of Features: " + order.getNumOfFeatures());
    }
    
    /**
     * Print the bill for a sigle order in the database.
     * @param order number, The number of the order to be printed.
     */
    public void printBill(int orderNumber)
    {
        int indexNumber = orderNumber - 10000;
        Order order = orders.get(indexNumber);
        System.out.print("\n" + "Customer ID: " + order.getCustomerID());
        System.out.print("\n" + "Order Number: " + order.getOrderNumber());
        System.out.print("\n" + "Design: " + order.getDesign() + " $ " + order.getBasePrice());
        System.out.print("\n" + "Number of Features: " + order.getNumOfFeatures() + " $ " + order.getFeaturesPrice());
        System.out.print("\n" + "Total Price: " + " $ " + order.getTotalPrice());
    }
    
    /**
     * Show a list of all the customers in the database.
     */
    public void listAllCustomers()
    {
        System.out.println("Customer listing: ");

        for(Customer customer : customers) {
            System.out.println("ID #: " + customer.getCustomerID() + " Name: " + customer.getFirstName() + " " + customer.getLastName());
        }
        System.out.println();
    }
    
    /**
     * Show a list of all the orders in the database.
     */
    public void listAllOrders()
    {
        System.out.println("Order listing: ");

        for(Order order : orders) {
            System.out.println("Order #: " + order.getOrderNumber() + " CustomerID: " + order.getCustomerID() + " Design: " + order.getDesign());
        }
        System.out.println();
    }
}
