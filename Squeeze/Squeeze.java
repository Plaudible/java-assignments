import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Squeeze
{
    static int i;
    public Squeeze()
    {
    }
    static void squeeze(String s)
    {
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch != ' ')
            System.out.print(ch);
        }

    }
}
