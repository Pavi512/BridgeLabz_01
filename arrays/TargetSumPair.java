package arrays;

import java.util.Scanner;

public class TargetSumPair {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		sumPair(ar,k);
	}

	public static void sumPair(int[] ar, int k) {
		for(int i=0;i<=ar.length-2; i++){
            int sum=0;
             for(int j=i; j<i+2; j++){
                sum = sum+ar[j];
             }
             if(sum==k){
                for(int j= i; j<i+2; j++){
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
             }
        }
	}
}
