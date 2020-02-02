import java.lang.Math.*;
/**
 * You do things with polygons and they look pretty.
 * 
 * @author Maxwell Bockmann 
 * @version Kappa
 */
public class Polygon
{
    // instance variables - replace the example below with your own
    private int myNumSides;          //# of sides
    private double mySideLength;     //length of side
    private double myR;              //radius of circumscribed circle
    private double myr;              //radius of inscribed circle
    /**
     * Constructor thing section place with the pudding and stuff. Kappa
     */
    public Polygon(int numSides, double sideLength)
    {
       myNumSides = numSides;
       mySideLength = sideLength;
    }
    public Polygon()
    {

    }
    /**
     * Why is Alice a fish? Kappa
     * 
     * @param  The whole club was starin' at her
     * @return Apple bottom jeans jeans boots with the fur with the fur
     */
    public double calcr()
    {
        return (1.0/2.0)*(mySideLength)*1.0/Math.tan(Math.PI/myNumSides);
    }
    public double calcR()
    {
        return (1.0/2.0)*(mySideLength)*1.0/Math.sin(Math.PI/myNumSides);
    }
    public double vertexAngle()
    {
        return (myNumSides - 2.0)/(myNumSides)*180;
    }
    public double Perimeter()
    {
        return mySideLength * myNumSides;
    }
    public double Area()
    {
        return 1.0/2.0*(myNumSides*(calcR()*calcR())*(Math.sin(2*Math.PI/myNumSides)));
    }
    public double getNumSide()
    {
        return myNumSides;
    }
    public double getSideLength()
    {
        return mySideLength;
    }
}
