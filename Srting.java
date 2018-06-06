import java.util.Scanner;
/**
 * Class demonstration.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Srting
{
   public static void main (String[] args)
   {
       //declare and instantiate a String
       String myString = new String("Hello");
       
       System.out.println(myString);
       
       //declare another String using shortcut approach
       String firstName = "Rushan";
       
       System.out.println( myString + " " + firstName );
       
       int theLength = firstName.length();
       System.out.println(theLength + " characters long");
       
       System.out.println( firstName.length() + " characters" );
       
       //cereate a Scanner object
       Scanner keyboard = new Scanner (System.in);
       //Prompt user to enter name
       System.out.print( "Enter your name " );
       firstName = keyboard.nextLine();
       System.out.println( "Hi, " + firstName);
       
       //Prompt user to enter hours worked
       System.out.print( "How many hours did you work? " );
       int hoursWorked = keyboard.nextInt();
       
       //clean out input buffer
       keyboard.nextLine();
       
       int grossPay = hoursWorked * 11;
       System.out.println("Your pay is " + grossPay);
       
       System.out.print( "What's your last name? " );
       String lastName = keyboard.nextLine();
       
       System.out.println("Thanks, " + firstName + " " + lastName );
       
    }
}
