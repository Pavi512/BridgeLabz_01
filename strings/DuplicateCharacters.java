package strings;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			duplicates(s);
	}

	public static void duplicates(String s) {
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		LinkedHashSet<Character> dup = new LinkedHashSet<Character>();
//		for(int i=0; i<s.length(); i++) {
//			if(!set.add(s.charAt(i))) {
//				dup.add(s.charAt(i));
//			}
//		}
//		String t = "";
//		for(Character c : dup) {
//			t = t + c;
//		}
//		System.out.println(t);
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(char ch : map.keySet()) {
			if(map.get(ch) > 1) {
				System.out.println(ch);
			}
		}

	}

}
