package strings;
import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		reverseString(s);
		
	}

	public static void reverseString(String s) {
		String t = "";
		for(int i=s.length()-1; i>=0; i--) {
			t = t + s.charAt(i);
		}
		System.out.println(t);
	}

}
