import java.util.Scanner;
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String [] args)
    {
       Scanner in = new Scanner(System.in);
       Grocerylist grocerylist = new Grocerylist();
       
       
       System.out.print("Please enter item 1:");
       grocerylist.setItem1(in.nextDouble());
       System.out.print("Please enter item 2:");
       grocerylist.setItem2(in.nextDouble());
       System.out.print("Please enter item 3:");
       grocerylist.setItem3(in.nextDouble());
       System.out.print("Please enter item 4:");
       grocerylist.setItem4(in.nextDouble());
       System.out.print("Please enter item 5:");
       grocerylist.setItem5(in.nextDouble());
       
       System.out.printf("%-10s", "Item:");
       System.out.printf("%22s", "Total Price:");
       System.out.println();
       System.out.printf("%-10s",+grocerylist.item1());
       System.out.println();
       System.out.printf("%-10s", +grocerylist.item2());
       System.out.println();
       System.out.printf("%-10s", +grocerylist.item3());
       System.out.println();
       System.out.printf("%-10s", +grocerylist.item4());
       System.out.println();
       System.out.printf("%-10s", +grocerylist.item5());
       System.out.printf("%22s",+grocerylist.getTotalCost());
       System.out.println();
       
    }
}
