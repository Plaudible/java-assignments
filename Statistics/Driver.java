import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Driver
{
      public static void main(String[] args)
      {
        Statistics stat = new Statistics();
        double [] values = {19,27,91,12,54,1,3,12,52,65,28,98,80,98,77,69,73,27,82,23,12,66,45,70,93,31,51,59,55,10,1,75,49,35,18,97,70,86,59,65,35,31,54,100};
        double sum=0;
        double finalsum = 0;
        double average = 0;
        for( double i : values) {
         finalsum =   (sum += i);
        }
        average = finalsum/(values.length);
        System.out.println("Average: "+ average);
        double sumX=0;
        double finalsumX=0;
        double[] x1_average = new double[2000];
        for (int i = 0; i<values.length; i++){
            double fvalue = (Math.pow((values[i] - average), 2));
            x1_average[i]= fvalue;
            System.out.println("test: "+ fvalue);
        }
        for( double i : x1_average) {
             finalsumX =   (sumX += i);
            }
        Double AverageX = finalsumX/(values.length);
         System.out.println("E(X1-x1_average)^2/AverageX: "+ AverageX);
        double SquareRoot = Math.sqrt(AverageX);
        System.out.println("Standard Deviation: "+ SquareRoot);
        stat.average();
        System.out.println("Average: "+average);
    }
}
