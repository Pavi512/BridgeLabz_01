package arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UnionArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>() ;
		int[] ar1 =new int[n];
		for(int i=0; i<ar1.length; i++) {
			ar1[i] = scan.nextInt(); 
			set.add(ar1[i]);
		}
		int m = scan.nextInt();
		int[] ar2 =new int[m];
		for(int i=0; i<ar2.length; i++) {
			ar2[i] = scan.nextInt();
			set.add(ar2[i]);
			
		}
		System.out.println(set);
	}

}
