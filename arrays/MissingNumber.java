package arrays;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		missingNumber(ar);
	}

	public static void missingNumber(int[] ar) {
		int n = ar.length+1;
		int expected = n*(n+1)/2;
		int actual = 0;
		for(int i=0; i<ar.length; i++) {
			actual = actual + ar[i];
		}
		System.out.println(expected - actual);
	}

}
