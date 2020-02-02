import java.util.Scanner;
/**
 * Write a description of class Grocerylist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grocerylist
{
    // instance variables - replace the example below with your own
    double item1;
    double item2;
    double item3;
    double item4;
    double item5;
    Scanner in = new Scanner(System.in);

      
    /**
     * Constructor for objects of class Grocerylist
     */
    public Grocerylist()
    {
       
    }
    public void setItem1(double item)
    {
        item1 = item;
    }
    public void setItem2(double item)
    {
        item2 = item;
    }
    public void setItem3(double item)
    {
        item3 = item;
    }
    public void setItem4(double item)
    {
        item4 = item;
    }
    public void setItem5(double item)
    {
        item5 = item;
    }
    public double item1()
    {
        return item1;
    }
    public double item2()
    {
        return item2;
    }
    public double item3()
    {
        return item3;
    }
    public double item4()
    {
        return item4;
    }
    public double item5()
    {
        return item5;
    }
    public double getTotalCost( )
    {
        return (item1 + item2 + item3 + item4 + item5);
    }
    
}
