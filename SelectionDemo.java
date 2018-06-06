import java.util.*;
/**
 * Write a description of class SelectionDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectionDemo
{
    public static void main(String[] args)
    {
      //create a Scanner obect
      Scanner keyboard = new Scanner(System.in);
   
      System.out.print( "Score? " );
      int score = keyboard.nextInt();
   
      if( score >= 70)
      {
        System.out.println( "You scored more than 70 " );
      }
      else
      {
          System.out.println( "You score less than 70 " );
      }
        
      if( 'a' > 'z' )
         {
             System.out.println( "a is greater than z" );
         }
         else 
         {
             System.out.println( "a is less than z" );
         }
         
      //if-else-if
       if( score <= 70)
      {
        System.out.println( "Fail " );
      }
      else if ( score <= 90 )
      {
          System.out.println( "OK " );
      }
      else
      {
          System.out.println( "Awesome" );
        }
      
      //and / or / not operator
      System.out.print( "# of absences: " );
      int absences = keyboard.nextInt();
      
       if( score >= 90 && absences <= 3 )
      {
        System.out.println( "Awesome" );
      }
      else if ( score >= 70 && absences <= 5 )
      {
          System.out.println( "OK " );
      }
      else
      {
          System.out.println( "No good" );
        }
        
      String s1 = "Hello";
      String s2 = "Goodbye";
      
      if ( s1.equals(s2) )
       System.out.println("Two strings are equal");
   }
}
