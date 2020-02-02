import java.util.Scanner;
public class carRental
{
   int a;
   int b;
   int c;
   int sum;
   char codeLetter;
    public carRental()
    {
        
    }
    public String encode(String letters, int numbers)
    {

        
        a = letters.charAt(0);
        b = letters.charAt(1);
        c = letters.charAt(2);
        
        sum = a+b+c+numbers;
        
        codeLetter = (char) (sum % 26+'A');
        return ""+codeLetter+sum;
        
    }
    public String getCode()
    {
        return ""+codeLetter+sum;
    }
}
    
    
