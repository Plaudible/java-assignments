import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Driver
{
    public static void main(String[] args) {
        double sum = 0;
        int lines = 0;
        try{
        File f = new File("Z:\\Intermediate Programming\\BlueJ Projects\\Semester 2\\numbers.txt");
        Scanner in = new Scanner(f);
        
       while (in.hasNextDouble()){
       sum += in.nextDouble();
       lines++;
       } 
        }catch(IOException i){
            System.out.println("error: " +i.getMessage());
        }
        double average = sum / lines;
        System.out.println("Sum: "+sum);
        System.out.println("Lines: "+lines);
        System.out.println("Average: "+average);
    }
}
