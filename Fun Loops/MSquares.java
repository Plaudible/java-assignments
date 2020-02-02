public class MSquares
{
    public MSquares()
    {
    }
    int magicNum(int n)
    {     
        int a = 0;
        long b;
        long c = 0;
        long e = 0;
        int count = 0;

        while (count < n) 
        {
            a = a + 1;
            b = a * a;
            while ((c < b) && (c != b)) 
            {
                e++;
                c += e;
            }
            if (c == b) 
            {
                count++;
                System.out.print(" " + b + ",");
            }
        }
        return n;
    }
  
}
