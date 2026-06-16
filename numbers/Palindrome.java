package numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(isPalindrome(n));
	}

	public static boolean isPalindrome(int n) {
		int rev = reverse(n);
		return rev==n ? true : false;
	}
	
	public static int reverse(int n) {
		int rev = 0;
		while(n>0) {
			rev = rev*10 + (n%10);
			n = n/10;
		}
		return rev;
	}

}
