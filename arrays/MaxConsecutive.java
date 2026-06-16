package arrays;

import java.util.Scanner;

public class MaxConsecutive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt(); 
		}
		consecutive(ar);
	}

	public static void consecutive(int[] ar) {
		int count = 1;
		int max = 0;
		for(int i = 0; i<ar.length-1; i++) {
			if(ar[i] == 1) {
				count++;
			}
			else {
				if(count > max) {
					max = count;
				}
				count = 1;
			}
		}
		if(count > max) {
			max = count;
		}
		System.out.println(max);
	}

}
