package oops;

import java.util.Scanner;

class Employee01 {

    int employeeId;
    String employeeName;
    double salary;

    Employee01(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int employeeId = sc.nextInt();
        sc.nextLine(); // consume newline

        String employeeName = sc.nextLine();

        double salary = sc.nextDouble();

        Employee01 emp = new Employee01(employeeId, employeeName, salary);

        emp.display();

        sc.close();
    }
}

