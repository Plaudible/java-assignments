
/**
 * Kawaii desu
 * 
 * @You know, not all people like lemons.
 * @Yup! That tasted purple!
 */
public class Taxes
{
    // instance variables - replace the example below with your own
    double hoursWorked;
    double hourlyRate;
    double grossPay;
    double federalTax;
    double ficaTax;
    double stateTax;
    /**
     * Constructor for objects of class Taxes
     */
    public Taxes(double hoursWorked, double hourlyRate)
    {
        // initialise instance variables
        grossPay = hoursWorked * hourlyRate;
        federalTax = 0.154;
        ficaTax = 0.0775;
        stateTax = 0.04;
    }    
    public double getFederalTax()
    {
        return federalTax * grossPay;
    }
    public double getFicaTax()
    {
        return ficaTax * grossPay;
    }
    public double getStateTax()
    {    
        return stateTax * grossPay;
    }
    public double getNetPay()
    {
        return grossPay - ((grossPay * federalTax) + (grossPay * ficaTax) + (grossPay * stateTax));
    }
    public double getGrossPay()
    {
        return grossPay;
    }
   }