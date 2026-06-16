package arrays;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		secondSmallestElement(ar);
	}

	public static void secondSmallestElement(int[] ar) {
		int fs = Integer.MAX_VALUE;
		int ss = Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i] < fs) {
				ss = fs;
				fs = ar[i];
			}
			else if(ar[i] < ss && ar[i]!=fs) {
				ss = ar[i];
			}
		}
		System.out.println(ss);
	}

}
