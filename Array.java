
/**
 * Write a description of class Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array
{
    public static void main( String[] args )
    {
        //declare an array of scores
        int[] scores = new int[10];
        
        //create a bonus variable
        final int BONUS = 5;
        
        //store some values in the array
        scores[0] = 8;
        scores[1] = 11;
        scores[2] = 9;
        scores[3] = 12;
        
        //create a loop to add bonus to the scores
        for( int i = 0; i < scores.length; i++ )
        {
            System.out.println( "Final score: " + ( scores[i] + BONUS ) );
        }
        
        System.out.println( scores[0] + scores[1] + scores[2] + scores[3] );
        
        //declare and initialize array values
        String[] names = { "Ann", "Bob", "Charlie" };
        
        //create a loop to display the elements in the names array
        for( int i = 0; i < names.length; i++ )
        {
            System.out.println( names[i] );
        }
    }
}
