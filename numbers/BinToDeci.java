package numbers;

import java.util.Scanner;

public class BinToDeci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        decimal(n);
    }
    public static void decimal(int n) {
        int sum =0;
        int i=0;
        while(n > 0) {
            sum += (n % 10) * (int)Math.pow(2, i);
            n /= 10;
            i++;
        }
        System.out.println(sum);
    }
}
