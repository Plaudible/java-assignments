//Parker Spires

import java.util.Scanner;

public class Driver
{
    public Driver()
    {
        int z = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter in the new account number: ");
        int acctNum = in.nextInt();
        System.out.print("Enter in the starting amount: ");
        double initialBalance = in.nextDouble();
        while(z == 0)if(initialBalance < 0){
            System.out.println("Error: initial balance cannot be negative");
            System.out.print("Enter in the starting amount: ");
            initialBalance = in.nextDouble();
        }
        else{
            z++;
        }
        CheckingAccount bob = new CheckingAccount(initialBalance, acctNum);
        System.out.println();
        System.out.println("Account number: " + bob.getAccountNum());
        System.out.println("Balance: " + bob.getBalance());
        int p;
        int x = 0;
        double amount;
        
        while (x == 0) {
             System.out.println("Press 0 to quit, 1 to deposit, and 2 to withdraw: ");
             p = in.nextInt();
            if(p == 0){
            System.out.println("Goodbye");
            x++;
           }
           else if(p == 1){
            System.out.println("Enter in the amount: ");
            amount = in.nextDouble();
            if(amount < 0){
                System.out.println("Error: Cannot deposit a negative amount.");
            }
            else{
                bob.deposit(amount);
                System.out.println("Balance: " + bob.getBalance());
            }
          }
          else if(p == 2){
            System.out.println("Enter in the amount: ");
            amount = in.nextDouble();
            if(amount > bob.getBalance()){
                System.out.println("Error: Not enough funds.");
                System.out.println("Balance: " + bob.getBalance());
            }else{
            bob.withdraw(amount);
            System.out.println("Balance: " + bob.getBalance());
          }
          }
          else{
            System.out.println("Press 0 to quit, 1 to deposit, and 2 to withdraw: ");
            p = in.nextInt();
          }
        }
    }
}
