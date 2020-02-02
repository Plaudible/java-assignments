
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    /**
     * Constructor for objects of class Driver
     */
    public static void main(String [] args)
    {
        // initialise instance variables
        Polygon polygon = new Polygon(4,10);
        System.out.println("R = " +polygon.calcR());
        System.out.println("r = " +polygon.calcr());
        System.out.println("Vertex angle = " +polygon.vertexAngle());
        System.out.println("Perimeter = " +polygon.Perimeter());
        System.out.println("Area = "+polygon.Area());
        System.out.println("Number of sides = "+polygon.getNumSide());
        System.out.println("Side length = "+polygon.getSideLength());
    }


}
