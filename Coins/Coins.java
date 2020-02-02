
/**
 * This is a program that is very tasty.
 * 
 * Wobbles.
 * @Why?
 */
public class Coins
{
    // instance variables - replace the example below with your own
    private int c;
    int q;
    int d;
    int n;
    int p;
    int qr;
    /**
     * Constructor for objects of class Coins
     */
    public Coins(int change)
    {
        // initialise instance variables
       c = change;
    }

    /**
     * When life gives you lemons, baked potatoes.
     * 
     * @Why do we even need to fill this in?
     * @Okay... -Amumu
     */
    public void calculate()
    {
        // put your code here
        int q = c / 25;
       System.out.println("Quarters = " + q);
        int qr = c % 25;
        int d = qr / 10;
        System.out.println("Dimes = " + d);
        int dr = qr % 10;
        int n = dr / 5;
        System.out.println("Nickels = " + n);
        int nr = dr % 5;
        int p = nr / 1;
        System.out.println("Pennies = " + p);
    }
}
