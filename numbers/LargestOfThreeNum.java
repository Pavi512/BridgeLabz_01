package numbers;

import java.util.Scanner;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int res = n1>n2 ? n1 : n2;
		System.out.println(res > n3 ? res : n3);
	}

}
