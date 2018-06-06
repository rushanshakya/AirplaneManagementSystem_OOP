
/**
 * Demonstration of output, variable, and mathematical operations.
 * 
 * @author Rushan Shakya
 * @version Spring 2017
 */
public class Demo
{
   public static void main ( String[] args)
   {
       // illustrate println method
       System.out.println("Output from the println method.");
       
       System.out.print("This ");
       System.out.print("comes ");
       System.out.print("from ");
       System.out.print("multiple ");
       System.out.print("lines.");
       
       System.out.println("\nName\tScore\tGrade");
       System.out.println("Rushan" + "\t" + "95" + "\t" + "A");
       
       int a = 1; double b = 2.0;
       System.out.println(a + " " + b);
       
       char middleInitial = 'S';
       System.out.println("Jane " + middleInitial + "Doe");
       
       boolean gradStudent;
       gradStudent = false;
       
       System.out.println("Is Joe a grad student? " + gradStudent);
       
       int  hours = 10;
       double payRate = 12.25;
       double totalPay = hours * payRate;
       System.out.println("The total pay is " + totalPay);
    }
}
