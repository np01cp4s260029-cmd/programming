class Person
 {
    int id;
    String name;
    double basicSalary;
    static String collegeName = "Isligton College "; 

    Person(int id, String name, double basicSalary)
    {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateAnnualSalary() 
    {
        return basicSalary * 12;
    }
}

class Teacher extends Person
 {
    String subject;
    double bonus;

    Teacher(int id, String name, double basicSalary, String subject, double bonus)
    {
        super(id, name, basicSalary);
        this.subject = subject;
        this.bonus = bonus;
    }

    double calculateAnnualSalary() 
    {
        return super.calculateAnnualSalary() + bonus;
    }

}

class Staff extends Person 
{
    double workingHours;
    double ratePerHour;
    
    Staff(int id, String name, double basicSalary, double workingHours, double ratePerHour) 
    {
        super(id, name, basicSalary);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    
    double calculateSalary() 
    {
        return workingHours * ratePerHour;
    }
}

public class SchoolApp 
{
    public static void main(String[] args) 
    {
        Teacher t1 = new Teacher(1, "Tosha", 50000, "Math", 10000);
        System.out.println("Teacher Annual Salary = " + t1.calculateAnnualSalary());

        Staff s1 = new Staff(2, "Arnav", 0, 8, 500);
        System.out.println("Staff Salary = " + s1.calculateSalary());

        System.out.println("College Name = " + Person.collegeName);
    }
}