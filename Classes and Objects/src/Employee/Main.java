package Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeSalary employee1 = new EmployeeSalary("Asho",500,80);
        EmployeeSalary employee2 = new EmployeeSalary("Ahmed",1500,200);
        EmployeeSalary employee3 = new EmployeeSalary("Mohaji",2500,400);

        employee1.displayInfo();
        System.out.println("Employee 1 Monthly Salary: " + employee1.monthlySalary);
        System.out.println("Employee 1 Annual Salary: " + employee1.calculateAnnualSalary());

        System.out.println("----------------------\n");
        employee2.displayInfo();
        System.out.println("Employee 2 Monthly Salary: " + employee2.monthlySalary);
        System.out.println("Employee 2 Annual Salary: " + employee2.calculateAnnualSalary());

        System.out.println("----------------------\n");
        employee3.displayInfo();
        System.out.println("Employee 3 Monthly Salary: " + employee3.monthlySalary);
        System.out.println("Employee 3 Annual Salary: " + employee3.calculateAnnualSalary());
    }
}
