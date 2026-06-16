package arrays;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt(); 
		}
		int k = scan.nextInt();
//		rotateArray(ar, k);
		for(int i=0; i<k; i++) {
			rotateArray(ar);
		}
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
	}

	public static void rotateArray(int[] ar) {
		int temp = ar[0];
		for(int i=0; i<ar.length-1; i++) {
			ar[i] = ar[i+1];
		}
		ar[ar.length-1] = temp;
	}

//	public static void rotateArray(int[] ar, int k) {
//		for(int i=k; i<ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
//		for(int i=0; i<k; i++) {
//			System.out.print(ar[i] + " ");
//		}
//	}
	

}
