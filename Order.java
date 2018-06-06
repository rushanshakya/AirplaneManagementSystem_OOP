
/**
 * problem domain class for orders
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Order
{
    // instance variables - replace the example below with your own
    private String orderNumber;
    private double amount;
    private Customer customer;

    /**
     * Constructor for objects of class Order
     */
    public Order()
    {
    }
    
    public Order ( String newNumber, double newAmount, Customer newCustomer )
    {
        orderNumber = newNumber;
        amount = newAmount;
        customer = newCustomer;
    }
    
    //get methods
    public String getOrderNumber()
    {
        return orderNumber;
    }
    public double getAmount()
    {
        return amount;
    }
    public Customer getCustomer()
    {
        return customer;
    }
    
    //set vaules
    public void setOrderNumber( String newNumber )
    {
        orderNumber = newNumber;
    }
    public void setAmount( double newAmount )
    {
        amount = newAmount;
    }
    
    public void setCustomer( Customer newCustomer )
    {
        customer = newCustomer;
    }
    
    //toString method
    public String toString()
    {
        return "Order number: " + orderNumber + "\n" + "Amount: " + amount + "\n" + "Customer name: " + customer.getCustomerName();
    }    
}
