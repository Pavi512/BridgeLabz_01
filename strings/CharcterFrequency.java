package strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CharcterFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		for(Entry<Character,Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
			
		}
	}

}
