package strings;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		countWords(s);
	}

	public static void countWords(String s) {
		int count = 0;
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) != ' ' && s.charAt(i+1) == ' ') {
				count++;
			}
		}
		System.out.println(s.charAt(0) == ' ' ? count : count+1);
	}

}
