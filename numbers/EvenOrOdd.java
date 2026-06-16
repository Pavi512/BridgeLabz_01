package numbers;

import java.util.Scanner;

public class EvenOrOdd {
    public static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        checkEvenOdd(n);
    }
}
