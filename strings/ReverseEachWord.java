package strings;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] ar = s.split(" ");
		for(int i=0; i<ar.length; i++) {
			System.out.print(reverseString(ar[i]) + " ");
		}
	}

	public static String reverseString(String s) {
		String t = "";
		for(int i=s.length()-1; i>=0; i--) {
			t = t + s.charAt(i);
		}
		return t;
	}
}
