package numbers;

import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        primeNumbersInRange(n);
    }

    public static void primeNumbersInRange(int n) {
        for(int i=1; i<n; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        else if(n==2 || n==3) {
            return true;
        }
        else if(n%2==0 || n%3==0) {
            return false;
        }
        else {
            for(int i=5; i*i<=n; i=i+6) {
                if(n%i == 0 || n%(i+2) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
