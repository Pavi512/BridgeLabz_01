package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LonestConsecutiveSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt(); 
		}
		consecutiveSequence(ar);
	}

	public static void consecutiveSequence(int[] ar) {
		Arrays.sort(ar);
		int len = 1;
		int max = 0;
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i+1] == ar[i]) {
				continue;
			}
			else if(ar[i+1] - ar[i] == 1) {
				len++;
			}
			else {
				if(len>max) {
					max = len;
				}
				len = 1;
			}
		}
		if(len>max) {
			max = len;
		}
		System.out.println(max);
	}

}
