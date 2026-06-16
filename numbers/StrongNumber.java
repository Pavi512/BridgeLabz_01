package numbers;

import java.util.Scanner;

//A Strong Number is a number whose sum of the 
//factorials of its digits is equal to the original number itself.

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		isStrongNum(n);
	}

	public static void isStrongNum(int n) {
		int temp = n;
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum = sum + factorial(rem);
			n = n/10;
		}
		System.out.println(temp == sum ? "Strong Number" : "Not Strong Number");
	}

	public static int factorial(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact  = fact*i;
		}
		return fact;
	}

}
