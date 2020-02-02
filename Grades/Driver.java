import java.util.Scanner;
public class Driver
{

    public static void main(String [] args)
    {     
     Grades grades = new Grades();
     Scanner in = new Scanner(System.in);
     System.out.println("Please enter the amount of classes you're taking: ");
     int classes=in.nextInt();
     System.out.println("Please enter your current GPA: ");
     double GPA=in.nextDouble();
     grades.grades(GPA);
     grades.classes(classes);
     

}
}
