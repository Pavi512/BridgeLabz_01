package numbers;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		swapTwoNum(n1,n2);
	}

	public static void swapTwoNum(int n1, int n2) {
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println(n1);
		System.out.println(n2);
	}

}
