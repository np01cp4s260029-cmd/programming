import java.util.Scanner;
public class FixeddepositNIB
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
            System.out.println("Enter the deposite amount (min Rs.1000): ");
            double principal=sc.nextDouble();
            if(principal<1000)
            {
                System.out.println("Minimum deposit is Rs.1000");
                
            }
            System.out.println("Enter annual interest rate(8%-12%): ");
            double rate=sc.nextDouble();
            if(rate<8 || rate >12)
            {
                System.out.println("Interest rate must be 8% to 12%.");
                
            }
            System.out.println("Enter duration in years(max 5 yrs): ");
            int year=sc.nextInt();
            if(year>5)
            {
                System.out.println("Maximum duration is 5 years.");
                
            }
            double monthlyrate=rate/100/12;
            int months=year*12;
            double result=1;
            double base=1 + monthlyrate;
            for(int i=0; i<months; i++)
            {
                result*=base;
            }
            double fee=principal * 0.005;
            double amountbeforefee=principal*result;
            double finalamount=amountbeforefee-fee;
            System.out.println("Fixed Deposit Details");
            System.out.println("Principal Amount:Rs. "+ principal);
            System.out.println("Interest Rate: "+rate +"%");
            System.out.println("Duration: "+year+"years");
            System.out.println("Maturity Amount(before fee):Rs. "+base);
            System.out.println("Processing fee(0.5%):Rs. "+fee);
            System.out.println("Final Amount:Rs. "+String.format("%.2f",finalamount));
            
        }
    }
