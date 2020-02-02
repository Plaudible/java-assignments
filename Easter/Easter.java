
/**
 * I really don't get this but I'm writing something here so it looks normalish.
 * Also I like lemons.
 * @Maxwell Bockmann 
 * @Apple bottom jeans?
 */
public class Easter
{
    // instance variables - replace the example below with your own
    private int y;
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int k;
    int r;
    int m;
    int n;
    int p;
 
    /**
     * Constructor for objects of class Easter
     */
    public Easter(int year)
    {
        // initialise instance variables
        y = year;
    
    }

    /**
     * Darude - Sandstorm
     * 
     * @How can my fingers be real if this text isn't real?
     * @/r/2spooky4me
     */
   public void calculate()
    {
        // put your code here
       int a = y % 19;
       System.out.println("a = " + a);
       int b = y / 100;
       System.out.println("b = " + b);
       int c = y % 100;
       System.out.println("c = " + c);
       int d = b / 4;
       System.out.println("d = " + d);
       int e = b % 4;
       System.out.println("e = " + e);
       int f = (b+8)/25;
       System.out.println("f = " + f);
       int g = (b - f + 1)/3;
       System.out.println("g = " + g);
       int h = (19 * a + b - d - g + 15) % 30;
       System.out.println("h = " + h);
       int i = c / 4;
       System.out.println("i = " + i);
       int k = c % 4;
       System.out.println("k = " + k);
       int r = (32 + 2 * e + 2 * i - h - k) % 7;
       System.out.println("r = " + r);
       int m = (a + 11 * h + 22 * r) / 451;
       System.out.println("m = " + m);
       int n = (h + r - 7 * m + 114) / 31;
       System.out.println("n = " + n);
       int p = (h + r - 7 * m + 114) % 31;
       System.out.println("p = " + p);
    }
}
