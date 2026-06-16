package strings;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String s = scan.nextLine().toLowerCase();
			count(s);		
	}

	public static void count(String s) {
		int vc=0, cc=0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c>='a' && c<='z') {
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
					vc++;
				}
				else {
					cc++;
				}
			}
		}
		System.out.println("Vowels = " + vc);
		System.out.println("Consonants = " + cc);
	}

}
