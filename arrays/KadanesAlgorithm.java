package arrays;

import java.util.Scanner;

public class KadanesAlgorithm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		maxSubArraySum(ar);
	}

	public static void maxSubArraySum(int[] ar) {
		int max = 0;
		for(int size = 1; size<ar.length; size++) {
			for(int i=0; i<=ar.length-size; i++){
				int sum=0;
				for(int j=i; j<i+size; j++){
					sum = sum + ar[j];
				}
				if(sum > max) {
					max = sum;
				}
			}
		}
		System.out.print(max);
	}
}
