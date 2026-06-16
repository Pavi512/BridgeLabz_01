package numbers;

import java.util.Scanner;

//You are given a number.
//
//Your task is to count how many bits are 1 in its binary representation.
//
//A set bit means a bit whose value is 1.
//
//A unset bit means a bit whose value is 0.

public class SetBits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		binary(n);
	}
	public static void binary(int n) {
		int count = 0;
		while(n>0) {
			if(n%2 == 1) {
				count++;
			}
			n = n/2;
		}
		System.out.println(count);
	}

}
