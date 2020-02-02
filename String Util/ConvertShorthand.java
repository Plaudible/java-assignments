import java.util.Scanner;
public class ConvertShorthand
{
    public static void main(String[] args)
    {
        System.out.println("Enter word: ");
        Scanner scanner = new Scanner(System.in);
        
        String string = scanner.nextLine();
        string = string.replaceAll("and", "&");
        string = string.replaceAll("to", "2");
        string = string.replaceAll("you", "U");
        string = string.replaceAll("for", "4");
        
        for (int i = 0; i < string.length(); i++) {
      char c = string.charAt(i);
      if ((c == 'a') || (c == 'e') || (c == 'i')
           || (c == 'o') || (c == 'u')) {
        String front = string.substring(0, i);
        String back = string.substring(i + 1);
        string = front + "" + back;
    }
    }
    System.out.println(string);
} 
}