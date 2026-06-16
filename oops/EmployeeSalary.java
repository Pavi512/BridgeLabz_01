package oops;
import java.util.Scanner;

class Employee {

    int monthlySalary;

    Employee(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int calculateAnnualSalary() {
        return monthlySalary * 12;
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Monthly Salary = ");
        int monthlySalary = sc.nextInt();

        Employee emp = new Employee(monthlySalary);

        System.out.println("Annual Salary = " + emp.calculateAnnualSalary());

        sc.close();
    }
}

