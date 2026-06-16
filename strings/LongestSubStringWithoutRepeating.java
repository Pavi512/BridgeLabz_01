package strings;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubStringWithoutRepeating {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			System.out.println(subString(s));
	}
	
	public static int subString(String s) {
		for(int size = s.length(); size>0; size--) {
			for(int i=0; i<=s.length()-size; i++) {
				String t = "";
				for(int j=i; j<i+size; j++) {
					t = t+s.charAt(j);
				}
				if(withoutRepeating(t)) {
//					return t;
                    return t.length();
				}
			}
		}
		return -1;
	}

	public static boolean withoutRepeating(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		for(char ch : map.keySet()) {
			if(map.get(ch) > 1) {
				return false;
			}
		}
		return true;
			
	}
		
	

}
