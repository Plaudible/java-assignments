import gpdraw.*;
/**
 * 
 * Apple bottom jeans
 * Boots with the fur 
 * The whole club was starin' at her
 */
public class Rectangle
{
    // instance variables - replace the example below with your own
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private DrawingTool pen;
    private SketchPad paper;
    /**
     * Constructor for objects of class Rectangle lol lemons
     */
    public Rectangle(double x, double y, double width, double height)
    {
        // initialise instance variables
        myWidth = myX;
        myHeight = myY;
        myWidth = width;
        myHeight = height;
        paper=new SketchPad(500, 500);
        pen=new DrawingTool(paper);
    }

    public double getPerimeter()
    {
        return 2 *(myWidth + myHeight);
    }
    public double getArea()
    {
        return myWidth * myHeight;
    }    
    public void draw()
    {
        pen.move (myWidth);
        pen.turn (90);
        pen.move (myHeight);
        pen.turn (90);
        pen.move (myWidth);
        pen.turn(90);
        pen.move (myHeight);
        pen.turn (90);
    }
}
