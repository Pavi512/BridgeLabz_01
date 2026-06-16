package arrays;

import java.util.Scanner;

public class ProductOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt(); 
		}
		int[] res = prodExceptSelf(ar);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static int[] prodExceptSelf(int[] ar) {
		int prod = 1;
		for(int i =0; i<ar.length; i++) {
			prod = prod * ar[i];
		}
		int[] res = new int[ar.length];
		for(int i=0; i<ar.length; i++) {
			res[i] = prod/ar[i];
		}
		return res;
	}

}
