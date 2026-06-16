package oops;
import java.util.Scanner;

class Student01 {

    int studentId;
    String studentName;

    Student01(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void display() {
        System.out.println(studentId + " " + studentName);
    }
}

public class ParameterizedConstructor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int studentId = sc.nextInt();
        sc.nextLine(); // consume newline

        String studentName = sc.nextLine();

        Student01 s = new Student01(studentId, studentName);

        s.display();

        sc.close();
    }
}