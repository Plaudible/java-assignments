import java.util.Scanner;
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver {
    static double myHeight;
    static double myLength;
    static double myWidth;
    /**
     * Constructor for objects of class Driver
     */
 public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter Dimension 1. ");
    double d1=input.nextInt();
    System.out.println("Enter Dimension 2. ");
    double d2=input.nextInt();
    System.out.println("Enter Dimension 3. ");
    double d3=input.nextInt();
    System.out.println("Enter the weight of the package. ");
    double weight=input.nextInt();
    
    if ((d1>d2)&&(d1>d3)){
        myLength=d1;
        myHeight=d2;
        myWidth=d3;
    }
    else
        if ((d2>d1)&&(d2>d3)){
            myLength=d2;
            myHeight=d1;
            myWidth=d3;
        }
    else
        if ((d3>d1)&&(d3>d2)){
                myLength=d3;
                myHeight=d1;
                myWidth=d2;
            }
    CheckMail mail=new CheckMail(myLength,myHeight,myWidth,weight);;
    System.out.println("The length of the package is "+myLength);
    System.out.println("The height of the package is "+myHeight);
    System.out.println("The width of the package is "+myWidth);
    mail.calculateGirth();
    mail.calculateValid();
    input.close();

    }
}

