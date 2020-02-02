
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Driver
     */
    public Driver()
    {
        // initialise instance variables
       Car auto = new Car(15);
       System.out.println("New car odometer reading: " + 15);
       auto.fillUp(150,8);
       System.out.println("Miles per gallon = " + auto.calculateMPG());
       System.out.println("Miles per gallon = " + auto.calculateMPG());
       auto.resetMPG();
       auto.fillUp(350, 10);
       auto.fillUp(450, 20);
       System.out.println("Miles per gallon = " + auto.calculateMPG());
       auto.resetMPG();
       auto.fillUp(603, 25.5);
       System.out.println("Miles per gallon = " + auto.calculateMPG());
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
