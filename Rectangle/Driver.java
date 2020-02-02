
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{  
    public static void main(String[] args)
    {
        System.out.println("Rectangle"); 
       Rectangle rectangle = new Rectangle(100, 200, 100, 200);
       System.out.println("Height = 100");
       System.out.println("Width = 200");
       System.out.println("Area = " + rectangle.getPerimeter());
       System.out.println("Perimeter = " + rectangle.getArea());
       rectangle.draw();
       
       System.out.println(" ");
       System.out.println("Circle");
       Circle circle = new Circle(50);
       System.out.println("Radius = 50");
       System.out.println("Area = " + circle.getPerimeter());
       System.out.println("Perimeter = " + circle.getArea());
       circle.Draw();
   
     
       
       
    }
}
