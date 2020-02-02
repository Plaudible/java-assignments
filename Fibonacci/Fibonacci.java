
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
    // instance variables - replace the example below with your own
    private int n;
    /**
     * Constructor for objects of class Fibonacci
     */
    public Fibonacci()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int Fib(int n)
    {
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else
            return Fib (n-1) + Fib (n-2);
    }
}
