import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
{
  Scanner scanner = new Scanner(System.in);
    
  LCM lcm = new LCM();
  System.out.println("Enter integer X: ");
  int y = scanner.nextInt();
  System.out.println("Enter integer Y: ");
  int x = scanner.nextInt();
  System.out.println("LCM: "+lcm.lcm(x,y));
  
  MSquares msquares = new MSquares();
  System.out.println("Enter integer N: ");
  int n = scanner.nextInt();
  System.out.println("Magic squares: "+msquares.magicNum(n));
}
}
