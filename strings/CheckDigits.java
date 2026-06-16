package strings;

import java.util.Scanner;

public class CheckDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(isDigits(s));
	}

	public static boolean isDigits(String s) {
		for(int i=0; i<s.length();i++) {
			if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
				return false;
			}
		}
		return true;
	}

}
