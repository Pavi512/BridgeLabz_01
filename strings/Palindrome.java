package strings;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(checkPalindrome(s));
	}

	public static String checkPalindrome(String s) {
		int i=0; 
		int j= s.length()-1;
		while(i<j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return "Not Palindrome";
			}
		}
		return "Palindrome";
	}

}
