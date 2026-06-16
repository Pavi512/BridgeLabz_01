package numbers;

import java.util.Scanner;

public class DeciToBin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		binary(n);
		decimal(n);
	}

	public static void binary(int n) {
		String res = "";
		while(n>0) {
			res = (n%2) + res;
			n = n/2;
		}
		System.out.println(res);
	}
	
	public static void decimal(int n) {
		int sum =0;
		int i=0;
		while(n > 0) {
		    sum += (n % 10) * (int)Math.pow(2, i);
		    n /= 10;
		    i++;
		}
		System.out.println(sum);
	}
}
