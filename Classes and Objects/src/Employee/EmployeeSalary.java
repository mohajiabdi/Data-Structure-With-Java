package Employee;

public class EmployeeSalary {
    String name;
    double monthlySalary, bonus;
    private static String compnay ="TechCorp";



    //Constructors

    public EmployeeSalary(String name,double monthlySalary, double bonus) {
        this.name = name;
        this.bonus = bonus;
        this.monthlySalary = monthlySalary;
    }

    double calculateAnnualSalary(){
        return this.monthlySalary *12 + bonus;
    }

    void displayInfo(){
        System.out.println("Name: " + name + "\nMonthly Salary: " + monthlySalary + "\nBonus: " + bonus + "\nCompany: " + compnay);
    }
}
