import java.util.Scanner;
public class Driver
{
    public static void main (String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert number of sides here:");
        int numSides = scanner.nextInt();
        System.out.println("Please insert the length of one side here:");
        double sideLength = scanner.nextDouble();
        GraphicPolygon gPoly = new GraphicPolygon(numSides, sideLength);
        gPoly.draw();
    }
}
