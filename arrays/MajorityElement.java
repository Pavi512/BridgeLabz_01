package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		majority(ar);
	}

	public static void majority(int[] ar) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<ar.length; i++) {
			map.put(ar[i], map.getOrDefault(ar[i], 0)+1);
		}
		int max = Integer.MIN_VALUE;
		for(int ch : map.keySet()) {
			if(map.get(ch) > max) {
				max = ch;
			}
		}
		System.out.println(max);
	}
}
