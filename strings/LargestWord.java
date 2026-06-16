package strings;

import java.util.Scanner;

public class LargestWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		largestWord(s);
	}

	public static void largestWord(String s) {
		String[] ar = s.split(" ");
		int max = 0;
		String t = "";
		for(int i=0; i<ar.length; i++) {
			if(ar[i].length() > max) {
				max = ar[i].length();
				t = ar[i];
			}
		}
		System.out.println(t);
	}

}
