
/**
 * Write a description of class LCM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LCM
{
static int lcm(int x, int y)
{

        int a;

        a = (x > y) ? x : y; // a is greater number

        while(true)

        {

            if(a % x == 0 && a % y == 0)

                return a;

            ++a;
   }
}
}