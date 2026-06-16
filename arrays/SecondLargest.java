package arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		secondLargesetElement(ar);
	}

	public static void secondLargesetElement(int[] ar) {
		int fl = ar[0];
		int sl = ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i] > fl) {
				sl = fl;
				fl = ar[i];
			}
			else if(ar[i] > sl && ar[i]!=fl) {
				sl = ar[i];
			}
		}
		System.out.println(sl);
	}

}
