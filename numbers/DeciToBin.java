package numbers;

import java.util.Scanner;

public class DeciToBin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		binary(n);
	}

	public static void binary(int n) {
		String res = "";
		while(n>0) {
			res = (n%2) + res;
			n = n/2;
		}
		System.out.println(res);
	}
	

}
