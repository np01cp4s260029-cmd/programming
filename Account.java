import java.util.Scanner;
class BankAccount
 {
    int accountNum;
    String holderName;
    double balance;
    
    BankAccount(int accNum, String name, double bal)
    {
        accountNum = accNum;
        holderName = name;
        balance = bal;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
        balance+= amount;
        System.out.println("Deposited: " + amount);
    }
    else
    {
        System.out.println("Invalid deposit amount.");
    }
    } 
    public void withdraw(double amount) 
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void displayBalance()
    {
        System.out.println("Account: " + accountNum);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

   public class Account
   {
       
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        BankAccount a1 = new BankAccount(657486526,"Josh Smith",6000000);
        BankAccount a2 = new BankAccount(543782435,"Unisha Koirala",150000.0);
        
        System.out.println("Enter the amount deposited by "+a1.holderName);
        double depa1=sc.nextDouble();
        a1.deposit(depa1);
        System.out.println("Enter the amount withdrawn by "+a1.holderName);
        double witha1=sc.nextDouble();
        a1.withdraw(witha1);
        
        
        System.out.println("\n--- Final Balances of account 1 ---");
        a1.displayBalance();
       
        System.out.println("Enter the amount deposited by "+a2.holderName);
        double depa2=sc.nextDouble();
        a2.deposit(depa2);
        System.out.println("Enter the amount withdrawn by "+a2.holderName);
        double witha2=sc.nextDouble();
        a2.withdraw(witha2);
        
        System.out.println("\n--- Final Balances of account 2 ---");
        a2.displayBalance();
    }
}