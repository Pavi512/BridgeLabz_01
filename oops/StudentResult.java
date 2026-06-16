package oops;

import java.util.Scanner;

class StudentMarks {

    int mark1;
    int mark2;
    int mark3;

    StudentMarks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public double calculatePercentage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    public String getResult() {

        if (mark1 >= 35 && mark2 >= 35 && mark3 >= 35) {
            return "Pass";
        }

        return "Fail";
    }
}

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        StudentMarks s = new StudentMarks(mark1, mark2, mark3);

        System.out.println("Percentage = " + s.calculatePercentage());
        System.out.println("Result = " + s.getResult());

        sc.close();
    }
}