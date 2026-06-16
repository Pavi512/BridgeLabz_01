package strings;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurences {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			char c = scan.nextLine().charAt(0);
			charcterOccurences(s,c);
	}

	public static void charcterOccurences(String s, char c) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(count);
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		for(int i=0; i<s.length(); i++) {
//			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//		}
//		for(char ch : map.keySet()) {
//			if(ch == c) {
//				System.out.println(map.get(ch));
//				
//			}
//		}
	}

}
