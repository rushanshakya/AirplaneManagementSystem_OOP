import java.text.DecimalFormat;
/**
 * Write a description of class CondutionOperand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CondutionOperand
{
    
    public static void main(String[] args)
    {
        DecimalFormat formatter1 = new DecimalFormat("$#,##0.00");
        int number = 3;
        //In-line condition operand
        System.out.println("There " + (number == 1?"is ":"are ") + number + (number == 1?" student ":" students ") +"here.");
        
        //switch statement
        int position = 3, prize = 0;
        String message = "";
        switch ( position)
        {
            case 1:
            message = "First Place Winner!!";
            prize = 500;
            break;
            
            case 2:
            message = "Second Place Winner!!";
            prize = 200;
            break;
            
            case 3:
            message = "Third Place Winner!!";
            prize = 100;
            break;
            
            default:
            message = "Did not place";
            prize = 0;
        }
       
        
        //decimal format class-- need to import java.text.DecimalFormat first
         System.out. println( "You are " + message + ". You won " + formatter1.format(prize) );
        
    }
}
