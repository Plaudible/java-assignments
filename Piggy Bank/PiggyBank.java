
/**
 * When rife gibs u remunz, you get remonade. 
 * 
 * @Maxwell Bockmann is so swagalicious that he can't make good programs.
 * @9/19/14
 */
public class PiggyBank
{
    // instance variables - replace the example below with your own
   private int pennies;
   private int nickels;
   private int dimes;
   private int quarters;
    /**
     * Constructor for objects of class PiggyBank
     */
    public PiggyBank(int findPennies, int findNickels, int findDimes, int findQuarters) 
    {
        pennies = findPennies;
        nickels = findNickels;
        dimes = findDimes;
        quarters = findQuarters;
    }

    /**
     * An example of a method - replace this comment with your own
     * ^ DON'T TELL ME WHAT TO DO ^
     * @Potato
     * @Of returnings 
     */
    public int getPennies()
    {
      return pennies;
    }
    public int getNickels()
    {
      return nickels;
    }   
    public int getDimes()
    {
      return dimes;
    }   
    public int getQuarters()
    {
      return quarters;
    }   
    public void setPennies(int newPennies)
    {
      pennies = newPennies;
    }
    public void setNickels(int newNickels)
    {  
      nickels = newNickels;
    }    
    public void setDimes(int newDimes)
    {
        dimes = newDimes;
    }
    public void setQuarters(int newQuarters)
    {
        quarters = newQuarters;
    }
}