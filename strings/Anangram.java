package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anangram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		System.out.println(checkAnangram(s1,s2));
	}

	public static String checkAnangram(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		
		return null;
	}
//	public static String checkAnangram(String s1, String s2) {
//		char[] c1 = s1.toCharArray();
//		char[] c2 = s2.toCharArray();
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		
//		return Arrays.equals(c1, c2) ? "Anangram" : "Not Anagram";
//	}

}
