
/**
 * Write a description of class DemoAssignment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DemoAssignment
{
   public static void main (String[] args)
   {
       //declare a couple of primitive variables
       int x1 = 10;
       int x2 = 34;
       
       //assign the value of x2 to x1
       x1 = x2;
       
       System.out.println( "x1 holds" + x1);
       System.out.println( "x2 holds" + x2);
       
       //assign new value to x2
       x2 = -5;
       
       System.out.println( "x1 holds" + x1);
       System.out.println( "x2 holds" + x2);
       
       Customer c1 = new Customer ("Anne", 500, true);
       Customer c2 = new Customer ("Bob", 100, false);
       
        System.out.println( "\n" + c1.toString() );
        System.out.println( "\n" + c2.toString() );
        
        //assign value of c2 to c1
        c1 = c2;
        
        System.out.println( "\n" + c1.toString() );
        System.out.println( "\n" + c2.toString() );
        
        c2.setAccountBalance( 321 );
        
        System.out.println( "\n" + c1.toString() );
        System.out.println( "\n" + c2.toString() );
    }
}
