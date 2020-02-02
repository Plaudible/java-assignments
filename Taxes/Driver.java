
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
    public Driver()
    {
       Taxes taxes = new Taxes(30,12.35);
       System.out.println("Gross Pay = " + taxes.getGrossPay());
       System.out.println(" ");
       System.out.println("Hours Worked = 30");
       System.out.println("Hourly Rate = 12.35");
       System.out.println(" ");
       System.out.println("Federal Tax (15.4%) = " + taxes.getFederalTax());
       System.out.println("FICA Tax(7.75%) = " + taxes.getFicaTax());
       System.out.println("State Tax(0.04%) = " + taxes.getStateTax());
       System.out.println(" ");
       System.out.println("Net Pay = " + taxes.getNetPay());
    }   
    
}
