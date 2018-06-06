
/**
 * Write a description of class ForLoopDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForLoopDemo
{
    public static void main( String[] args )
    {
       //simple loop to display the positive integers up to 10
       for( int i = 1; i <= 10; i++ )
       {
           System.out.println( i );
        }
        
        //declare a variable
        int sum = 0;
        //loop to compute the total of the first 10 integers
        for( int i = 1; i<= 10; i++ )
        {
            sum += i;
            System.out.println( "i: " + i + " sum: " + sum );
        }
    }
}
