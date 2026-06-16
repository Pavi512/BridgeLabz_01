package strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(nonRepeatedCharacter(s));
	}

	public static char nonRepeatedCharacter(String s) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
//		Set<Entry<Character, Integer>> entries = map.entrySet();
//		for(Entry<Character, Integer> e : entries) {
//			if(e.getValue() == 1) {
//				return e.getKey();
//			}
//		}
		
		for(char ch : map.keySet()) {
			if(map.get(ch) == 1) {
				return ch;
			}
		}
		return ' ';
	}

}
