package arrays;

import java.util.Scanner;

public class MoveZeros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		int[] res = moveZerosEnd(ar);
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
	}

	public static int[] moveZerosEnd(int[] ar) {
		int i =0;
		int j =0;
		while(i<ar.length) {
			if(ar[i] == 0) {
				i++;
			}
			else {
				ar[j] = ar[i];
				i++;
				j++;
			}
		}
		while(j<ar.length) {
			ar[j] = 0;
			j++;
		}
		return ar;
	}

}
