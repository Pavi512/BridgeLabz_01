package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt(); 
		}
		threeSumEqualToZero(ar);
	}

	public static void threeSumEqualToZero(int[] ar) {
		Arrays.sort(ar);
		for(int i=0; i<ar.length-1; i++) {
			int left = i+1;
			int right = ar.length-1;
			while(left<right) {
				int sum = ar[i] + ar[left] + ar[right];
				if(sum == 0) {
					System.out.println(ar[i] + " " + ar[left] + " " + ar[right]);
					left++;
					right--;
				}
				else if(sum<0) {
					left++;
				}
				else {
					right--;
				}
			}
		}
	}

}
