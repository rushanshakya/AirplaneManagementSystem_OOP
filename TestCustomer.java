
/**
 * Test code for customer class.
 * 
 * @author Rushan Shakya     
 * @version 2/15/2017
 */
public class TestCustomer
{
   public static void main(String [] args)
   {
       //Create Customer Objects
       Customer customer1 = new Customer();
       
       //Assign values to the object's instance variables
       customer1.setCustomerName( "Rushan");
       customer1.setAccountBalance( 350 );
       customer1.setPremiumCustomer( true );
       
       //Display values of object's instance variables
       System.out.println( customer1.getCustomerName() );
       System.out.println( customer1.getAccountBalance() );
       System.out.println( customer1.isPremiumCustomer() );
       
       //Display result of calling toSting method
       System.out.println( customer1.toString() );
       
       //make purchase
       customer1.makePurchase( 90 );
      
       System.out.println ( customer1.toString() );
       
       //make payment
       customer1.makePayment( 440 );
      
       System.out.println ( customer1.toString() );
       
       //create an object with the one-argumet constructor
       Customer customer2 = new Customer("Any");
       
       //display twoSting for Customer2
       System.out.println ( customer2.toString() );
       
        //create an object with the one-argumet constructor
       Customer customer3 = new Customer( "Joe", 500, true );
       
       //display twoSting for Customer3
       System.out.println ( customer3.toString() );
       
       //create Order object
       Order order1 = new Order( "13", 500, customer1 );
       System.out.println("Order Number " + order1.getOrderNumber() );
       System.out.println( "Amount " + order1.getAmount() );
       System.out.println("Customer " + order1.getCustomer() );
       System.out.println(order1.toString() );
       
       //write a line of code that will display the customer name and the order amout without using the customer reference variable
       System.out.println( "Customer Name: " + order1.getCustomer().getCustomerName() + 
                            "\n" + "Order: " + order1.getAmount() );
                            
       //write a line of code that will display the sum of the current account balance and the order amount without using the Customer reference variable
       System.out.println( "The sum is " + (order1.getAmount() + order1.getCustomer().getAccountBalance()));
       
       //write a line of code that will save the sum of the customer's current account balance plus the order amount as the new value for customer's account balance withou using the customer reference variable
       order1.getCustomer().setAccountBalance(
                    order1.getAmount() + order1.getCustomer().getAccountBalance());
      
    }
}
