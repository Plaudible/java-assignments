import java.util.Scanner;
public class TestTime
{
   Scanner Scanner = new Scanner(System.in);
    public static void main(String[] args) throws TimeClassException
    { new TestTime();
    }
    public TestTime() throws TimeClassException
    {
     System.out.println("Please input the hour (0-11): ");
     String sHour = Scanner.next();
     System.out.println("Please indicate am or pm (a,p): ");
     String indicator = Scanner.next();
     try
        {
                Time now = new Time (sHour, indicator);
                System.out.println("The time is " + now.toString());
            }
            catch(TimeClassException e)
            {
             System.out.println(e.getMessage());   
            }
    }
}
