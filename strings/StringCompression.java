package strings;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		compression(s);
	}

	public static void compression(String s) {
		int count=1;
		String t = "";
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				count++;
			}
			else {
				t = t + s.charAt(i)+count;
				count = 1;
			}
		}
		t = t + s.charAt(s.length()-1)+count;
		System.out.println(t);	
	}

}
