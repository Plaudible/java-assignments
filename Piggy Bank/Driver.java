
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Driver
     */
    public static void main(String[] args)
 
 {
    PiggyBank piggybank = new PiggyBank(30, 30, 30, 30);
    System.out.println("You have " +piggybank.getPennies() +" pennies.");
    System.out.println("You have " +piggybank.getNickels() +" nickels.");
    System.out.println("You have " +piggybank.getDimes() +" dimes.");
    System.out.println("You have " +piggybank.getQuarters() +" quarters.");
    piggybank.setPennies(30);
    piggybank.setNickels(36);
    piggybank.setDimes(42);
    piggybank.setQuarters(48);
    System.out.println("You now have " +piggybank.getPennies() +" pennies.");
    System.out.println("You now have " +piggybank.getNickels() +" nickels.");
    System.out.println("You now have " +piggybank.getDimes() +" dimes.");
    System.out.println("You now have " +piggybank.getQuarters() +" quarters.");
 }
    }

