import java.util.Scanner;
public class Driver
{
    public static void main (String[] args)
    {
       Scanner scanner = new Scanner(System.in);

       carRental carrental = new carRental();
        
       System.out.println("Enter 3 letters from license plate: ");
       String letters = scanner.nextLine();
        
       System.out.println("Enter last 3 license plate numbers: ");
       int numbers = scanner.nextInt();
        
       carrental.encode(letters, numbers);
       
       System.out.println("License code: "+carrental.getCode());
    }
}
