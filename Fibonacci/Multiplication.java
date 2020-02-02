/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Multiplication
{
    public int mult(int m, int n){
        if (n == 1){
            return m;
        }else{
            return m + mult(m, n-1);
        }
    }
}
