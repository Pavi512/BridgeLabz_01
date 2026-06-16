package strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String s1 = scan.nextLine();
			removeDuplicate(s1);
	}

	public static void removeDuplicate(String s1) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s1.length(); i++) {
			set.add(s1.charAt(i));
		}
		String t = "";
		for(Character c : set) {
			t = t + c;
		}
		System.out.println(t);
	}

}
