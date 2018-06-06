
/**
 * Write a description of class Payroll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Payroll
{
  public static void main(String[] args)
  {
      // declare a variable
      int hours = 40;
      // declare more variables
      double grossPay, payRate = 25.0;
      
      // compute gross pay
      grossPay =  hours * payRate;
      // output the calculated value
      System.out.println("Your gross pay is $" + grossPay);
  }
}
