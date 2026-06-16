package numbers;

import java.util.Scanner;

public class TrailingZeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		trailingZeros(n);
	}
	public static void trailingZeros(int n) {
	    int count = 0;
	    while (n > 0) {
	        n = n / 5;
	        count = count + n;
	    }
	    System.out.println(count);
	}

}
