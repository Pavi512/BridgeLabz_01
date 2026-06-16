package oops;

import java.util.Scanner;

class Employee02 {

    int id;
    String name;

    Employee02(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee02[] employees = new Employee02[5];

        int count = 0;

        while (true) {

            System.out.println("\n1.Add Employee");
            System.out.println("2.Search Employee");
            System.out.println("3.Display Employees");
            System.out.println("4.Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count < employees.length) {

                        int id = sc.nextInt();
                        sc.nextLine();

                        String name = sc.nextLine();

                        employees[count] = new Employee02(id, name);

                        count++;
                    } else {
                        System.out.println("Employee Storage Full");
                    }

                    break;

                case 2:

                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (employees[i].id == searchId) {

                            employees[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found");
                    }

                    break;

                case 3:

                    for (int i = 0; i < count; i++) {
                        employees[i].display();
                    }

                    break;

                case 4:

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
