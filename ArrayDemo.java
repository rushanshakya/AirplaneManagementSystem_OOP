
/**
 * Write a description of class ArrayDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayDemo
{
    public static void main(String[] args)
    {
        //create and initialize an array ints
        int[] numbers = {-2, 31, 56, 106, 2};
        
        System.out.println("The length of numbers: " + numbers.length);
        
        //Enhanced for loop
        for( int aNumber: numbers )
        {
            System.out.println("The current value is: " + aNumber );
        }
        
        //create a second array variable and assign to the first array object
        int [] numbersTwo = numbers;
        
        numbers[1] = 876;
        
        for( int aNumber: numbersTwo )
        {
            System.out.println( "The current value is: " + aNumber);
        }
        
        //create a second array object that has the same lenght as the first one
        int[] numbersThree = new int[numbers.length];
        
        //loop to read values from numbers and copy them to numbersThree
        for(int i = 0; i < numbers.length; i++ )
        {
            numbersThree[i] = numbers[i];
        }
        
        for( int aNumber: numbersThree )
        {
            System.out.println( "The current value is: " + aNumber);
        }
        numbersThree[1] = -86;
        for( int aNumber: numbersThree )
        {
            System.out.println( aNumber );
        }
    }
}
