package arrays;

import java.util.Scanner;

public class LeaderInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt(); 
		}
		leaders(ar);
	}

	public static void leaders(int[] ar) {
		int max = Integer.MIN_VALUE;
		for(int i = ar.length-1; i>=0; i--) {
			if(ar[i] > max) {
				max = ar[i];
				System.out.println(max);
			}
		}
	}

}
