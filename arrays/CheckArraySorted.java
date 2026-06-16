package arrays;

import java.util.Scanner;

public class CheckArraySorted {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt(); 
		}
		System.out.println(checkSorted(ar));
	}

	public static boolean checkSorted(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i] > ar[i+1]) {
				return false;
			}
		}
		return true;
	}

}
