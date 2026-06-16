package numbers;

import java.util.Scanner;

public class SumOfDigits {
        public static int sumOfDigits(int n) {
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum = sum + rem;
                n = n / 10;
            }
            return sum;
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            System.out.println(sumOfDigits(n));
        }
    }

