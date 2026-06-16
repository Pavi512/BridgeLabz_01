package numbers;

import java.util.Scanner;

//An Automorphic Number is a number whose square ends with the number itself.
//
//In simple words:
//
//Find the square of the number.
//Check whether the last digits of the square are the same as the original number.
//If yes, it is an Automorphic Number.

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		isAutomorphicNumber(n);
	}

	public static void isAutomorphicNumber(int n) {
		int count = countDigits(n);
		int square = n*n;
		int lastdigits = square % (int)Math.pow(10, count);
		System.out.println(n == lastdigits ? "Automorphic Number" : "Not Automorphic Number");
	}
	
	public static int countDigits(int n) {
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
	}

}
