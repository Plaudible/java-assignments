import java.util.Scanner;
public class TabDriver
{
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     Tables tables = new Tables();
     System.out.println("Enter table size: ");
     int tableSize = scanner.nextInt();
     tables.printMultiplicationTable(tableSize);
   }
}


