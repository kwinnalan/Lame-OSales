
/**
 * Customer class holds information about a customer.
 *
 * @author Kwinn Danforth
 * @version 1.0.01
 */
public class Customer
{
    private int customerID;
    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer(int customerID, String firstName, String lastName, String company, String address, String city, String state, String zipCode,String phoneNumber)
    {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        
    }
    
    /**
     * This is an accessor method for the customer's ID number.
     *
     * @return    customerID.
     */
    public int getCustomerID()
    {
        return this.customerID;
    }
    
    /**
     * This is a setter method for the customer's first name.
     *
     * @param newFirstName.
     */
    public void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }
    
    /**
     * This is an accessor method for the customer's first name.
     *
     * @return    firstName.
     */
    public String getFirstName()
    {
        return this.firstName;
    }
    
    /**
     * This is a setter method for the customer's last name.
     *
     * @param newLastName.
     */
    public void setLastName(String newLastName)
    {
        this.firstName = newLastName;
    }
    
    /**
     * This is an accessor method for the customer's last name.
     *
     * @return    lastName.
     */
    public String getLastName()
    {
        return this.lastName;
    }
    
    /**
     * This is a setter method for the customer's company name.
     *
     * @param newCompany.
     */
    public void setCompany(String newCompany)
    {
        this.company = newCompany;
    }
    
    /**
     * This is an accessor method for the customer's company name.
     *
     * @return    company.
     */
    public String getCompany()
    {
        return this.company;
    }
    
    /**
     * This is a setter method for the customer's address.
     *
     * @param newAddress.
     */
    public void setAddress(String newAddress)
    {
        this.address = newAddress;
    }
    
    /**
     * This is an accessor method for the customer's address.
     *
     * @return    address.
     */
    public String getAddress()
    {
        return this.address;
    }
    
    /**
     * This is a setter method for the customer's City.
     *
     * @param newCity.
     */
    public void setCity(String newCity)
    {
        this.city = newCity;
    }
    
    /**
     * This is an accessor method for the customer's city.
     *
     * @return    city.
     */
    public String getCity()
    {
        return this.city;
    }
    
    /**
     * This is a setter method for the customer's State
     *
     * @param newState.
     */
    public void setState(String newState)
    {
        this.state = newState;
    }
    
    /**
     * This is an accessor method for the customer's State.
     *
     * @return    state.
     */
    public String getState()
    {
        return this.state;
    }
    
    /**
     * This is a setter method for the customer's Zip Code.
     *
     * @param newZipCode.
     */
    public void setZipCode(String newZipCode)
    {
        this.zipCode = newZipCode;
    }
    
    /**
     * This is an accessor method for the customer's zip code.
     *
     * @return    zipCode.
     */
    public String getZipCode()
    {
        return this.zipCode;
    }
    
    /**
     * This is a setter method for the customer's phone number.
     *
     * @param newPhoneNumber.
     */
    public void setPhoneNumber(String newPhoneNumber)
    {
        this.phoneNumber = newPhoneNumber;
    }
    
    /**
     * This is an accessor method for the customer's phone number.
     *
     * @return    phoneNumber.
     */
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    /**
     * Print information to show the customer options for the website order.
     * 
     * @param order number, The number of the order to be printed.
     */
    public void showOptions()
    {
        System.out.print("\n" + "Design## Base Price ## Feature 1 ## Feature 2 ## Feature 3 ## Feature 4 ## Feature 5");
        System.out.print("\n" + "Nature### 300 ########### 10 ########## 15 ######### 20 ########## 25 ######## 30");
        System.out.print("\n" + "Tech##### 350 ########### 20 ########## 30 ######### 40 ########## 50 ######## 60");
        System.out.print("\n" + "Business# 375 ########### 30 ########## 40 ######### 50 ########## 60 ######## 70");
        System.out.print("\n" + "Music#### 400 ########### 85 ########## 95 ######## 110 ######### 130 ####### 210");
        System.out.print("\n" + "Naughty## 500 ########## 100 ######### 200 ######## 300 ######### 400 ####### 500");
    }
    
    
}
