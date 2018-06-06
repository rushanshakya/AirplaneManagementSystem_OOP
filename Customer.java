
/**
 * Customer problem dpmain class.
 * 
 * @author Rushan Shakya 
 * @version 2/13/2017
 */
public class Customer
{
    // instance variables
    private String customerName;
    private double accountBalance;
    private boolean premiumCustomer;

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
        customerName = "Unknown";
        accountBalance = 0;
        premiumCustomer = false;
    }
    
    
    /**
     * Constructor for objects of Class Coustomer
     * @param newName The value to be assigned to the new object's name variabe.
     */
     public Customer( String newName)
    {
        customerName = newName;
    }
    
    public Customer( String newName, double newBalance, boolean newPremiumCustomer)
    {
        customerName = newName;
        accountBalance = newBalance;
        premiumCustomer = newPremiumCustomer;
    }
    
    //get method
    public String getCustomerName()
    {
        return customerName;
    }
    
    public double getAccountBalance()
    {
        return accountBalance;
    }
    
    public boolean isPremiumCustomer()
    {
        return premiumCustomer;
    }
    
    //set methods
    public void setCustomerName( String newName )
    {
        customerName = newName;
    }
    
    
    public void setAccountBalance( double newBalance )
    {
        while ( newBalance < 0)
        {
           System.out.println( "Account balance can't be negative" );
           newBalance = 0;
           System.out.println( "A default value of 0 was set for the balance" );
        }
         accountBalance = newBalance;
    }
    
    
    public void setPremiumCustomer( boolean newPremium )
    {
        premiumCustomer = newPremium;
    }
    
   //toString method
   public String toString()
   {
       return "Customer name:" + customerName +
              "\n" + "Account Balance:" + accountBalance +
              "\n" + "Premium Customer:" + premiumCustomer;
    }
    
    //domain specific methods
    /**
     * This method allows a customer to make purchases and adds charges to account balance.
     * @param purchaseAmount The amount to be charged
     */
    public void makePurchase( double purchaseAmount )
    {
        accountBalance = accountBalance + purchaseAmount;
    }
    
    public void makePayment( double paymentAmount )
    {
        accountBalance = accountBalance - paymentAmount;
    }
}
