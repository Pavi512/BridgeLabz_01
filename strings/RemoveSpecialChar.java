package strings;

import java.util.Scanner;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		removeSpecialCharcater(s);
	}
	public static void removeSpecialCharcater(String s) {
		for(int i=0; i<s.length(); i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || 
              (s.charAt(i)>='0' && s.charAt(i)<='9') || s.charAt(i) == ' '){
            		System.out.print(s.charAt(i));
            }
        }
	}

}
