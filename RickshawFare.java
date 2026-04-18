import java.util.Scanner;
public class RickshawFare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in km: ");
        double distance=sc.nextDouble();
        System.out.println("Enter the time in minutes: ");
        double time=sc.nextDouble();
        double fare=(distance*20)+(time*2);
        System.out.println("Is the customer local?");
        char local=sc.next().charAt(0);
        if(local=='n')
        {
            fare=fare+50;
        }
        System.out.println("Is it night time?");
        char night=sc.next().charAt(0);
        if(night=='y')
        {
            fare=fare*1.2;
        }
            
        System.out.println("Final Fare:Rs. "+fare);
        
    }
}