import java.util.Scanner;
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver

{
    static char filingStatus;
    static double taxableIncome;
    static double federalIncomeTax;
    static double grossIncome; 
    /**
     * Constructor for objects of class Driver
     */
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        IRS irs = new IRS();
        
        System.out.println("Please enter your marital status as S for single or M for married");
       filingStatus = scan.next().charAt(0);

        System.out.println("Please enter your gross income.");
        grossIncome = scan.nextDouble();
        
        if (filingStatus == 'M') {
           {taxableIncome = grossIncome - (3800 * 2) - 11900;}
           System.out.printf("Your taxable income is %f.", taxableIncome);
        } else {
            {taxableIncome = grossIncome - 3800 - 5950;}
            System.out.printf("Your taxable income is %f.", taxableIncome);
        }
        if (filingStatus == 'M' && taxableIncome >388350)
        {federalIncomeTax = ((taxableIncome - 388350) * .35) + 105062;}
        else if (filingStatus == 'S' && taxableIncome >388350)
        {federalIncomeTax = ((taxableIncome- 388350)*.35)+112683.5;}
        else if (filingStatus == 'M' && taxableIncome >217250)
        {federalIncomeTax = ((taxableIncome-217450)*.33)+48665;}
        else if (filingStatus == 'S' && taxableIncome >178650)
        {federalIncomeTax = ((taxableIncome-178650)*.33)+43482.5;}
        else if (filingStatus == 'M' && taxableIncome >142700)
        {federalIncomeTax = ((taxableIncome-142700)*.28)+27735;}
        else if (filingStatus == 'S' && taxableIncome >85650)
        {federalIncomeTax = ((taxableIncome - 85650)*.28)+17442.5;}
        else if (filingStatus == 'M' && taxableIncome >70700)
        {federalIncomeTax = ((taxableIncome-70700)*.25)+9735;}
        else if (filingStatus == 'S' && taxableIncome >35350)
        {federalIncomeTax = ((taxableIncome-35350)*.25)+4867.5;}
        else if (filingStatus == 'M' && taxableIncome >17400)
        {federalIncomeTax = ((taxableIncome-17400)*.15)+1740;}
        else if (filingStatus == 'S' && taxableIncome >8700)
        {federalIncomeTax = ((taxableIncome-8700)*.15)+870;}
        else if (filingStatus == 'M' && taxableIncome <= 17400)
        {federalIncomeTax = (taxableIncome*.1);}
        else if (filingStatus == 'S' && taxableIncome <=8700)
        {federalIncomeTax = (taxableIncome*.1);}
        System.out.println(" ");
        System.out.printf("Your Federal Income Tax is %1s", federalIncomeTax);
    }
}
