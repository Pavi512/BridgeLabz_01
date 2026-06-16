package arrays;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		duplicateElements(ar);
	}

	public static void duplicateElements(int[] ar) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0; i<ar[i]; i++) {
			set.add(ar[i]);
		}
//		System.out.println(set);
		for(Integer c : set) {
			System.out.print(c + " ");
			
		}
		
	}

}
