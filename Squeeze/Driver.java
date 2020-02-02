import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Driver
{
    public static void main (String args[])
    {
        Squeeze SqueezeString = new Squeeze();
        try{
            File f = new File("Z:\\Intermediate Programming\\BlueJ Projects\\Semester 2\\squeeze.txt");
            Scanner in = new Scanner(f);
            String test = in.nextLine();
            test.replaceAll("^\\s+", "");
            System.out.println("String : " +test);
        }catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }
        
    } 
}