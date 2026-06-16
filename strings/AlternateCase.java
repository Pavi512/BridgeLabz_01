package strings;

import java.util.Scanner;

public class AlternateCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		toggleCase(s);
	}

	public static void toggleCase(String s) {
		String t = "";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c>='A' && c<='Z') {
				t = t + (char)(c + 32);
			}
			else if(c>='a' && c<='z') {
				t = t + (char)(c - 32);
			}
		}
		System.out.println(t);
	}

}
