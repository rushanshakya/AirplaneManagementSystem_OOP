import java.util.*;
/**
 * Write a description of class LoopDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopDemo
{
       public static void main(String[] args)
    {
        // incremetn and decrement variable
        int x = 10;
        
        //use increment operator
        x++;
        System.out.println( x );
        System.out.println( x++ );
        
         //use increment operator
        x--;
        System.out.println( x );
        System.out.println( x-- );
        
        //display positive integer up to 10
        //initialize control variable
        int i = 1;
        while ( i <= 10) //check value of control variable
        {
            System.out.println( "The number is " + i );
            i++;
        }
        
        //wtire a loop that will display the positive integer
        //on each loop iteration ask the user if they want to continue
        boolean answer = true;
        Scanner keyboard = new Scanner(System.in);
        while ( answer )
        {
            System.out.print( "Do you want to continue " );
            answer = keyboard.nextBoolean();
            System.out.println( "\nThe number is " + i );
            i++;            
        }
       
        int num = 1;
        do
        {
            System.out.println( "This number is " + num );
        }
        while ( num <= 5 );
    }
}
