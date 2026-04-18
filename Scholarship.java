import java.util.Scanner;
public class Scholarship
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double gpa;
    
            System.out.print("Enter GPA (0.0 - 4.0): ");
            gpa = sc.nextDouble();
        if(gpa>4.0)
        {
            System.out.println("Invalid GPA.");
        }
        
        else if (gpa >= 3.6 || gpa==4.0) 
        {
            System.out.println("Congratulations,you are eligible for full scholarship.");
        } 
        else if (gpa >= 3.0)
        {
            System.out.println("Congratulations,you are eligible for partial scholarship.");
        } 
        
        else
        {
            System.out.println("Sorry,you are not eligible for scholarship.");
        }
    }
}