import gpdraw.*;
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    // instance variables - replace the example below with your own
    private double myRadius;
    private DrawingTool pen;
    private SketchPad paper;
    /**
     * Apple bottom jeans
     */
    public Circle(double radius)
    {
        paper=new SketchPad(500, 500);
        pen=new DrawingTool(paper);
        myRadius = radius;
    }
    public double getPerimeter()
    {
        // put your code here
        return 2*(myRadius * 3.14);
    }
    public double getArea()
    {
       return 3.14*(myRadius*myRadius) ;
    }    
    public void Draw()
    {
       pen.drawCircle(myRadius)  ;
    }
}
