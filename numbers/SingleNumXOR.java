package numbers;

import java.util.Scanner;

public class SingleNumXOR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt(); 
		}
		singleNumUsingXor(ar);
	}

	public static void singleNumUsingXor(int[] ar) {
		int res = 0;
		for(int i=0; i<ar.length; i++) {
			res = res^ar[i];
		}
		System.out.println(res);
	}

}
