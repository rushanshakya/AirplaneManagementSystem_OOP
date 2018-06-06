
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle
{
    // instance variables - replace the example below with your own
    private double length, width;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle( double newLength, double newWidth)
    {
        // initialise instance variables
        length = newLength;
        width = newWidth;
    }

    /**
     * Method to compute rectangles area
     * @return the computed area of the rectangle
     */
    public double getArea()
    {
        // put your code here
        double area = length * width;
        return area;
    }
}
