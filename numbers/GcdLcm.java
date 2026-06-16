package numbers;

import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
//		System.out.println(gcd(n1,n2));
		System.out.println(lcm(n1,n2));
	}

	public static int lcm(int n1, int n2) {
		return n1*n2/gcd(n1,n2);
	}

	public static int gcd(int n1, int n2) {
		while(n1!=0 && n2!=0) {
			if(n1 > n2) {
				n1 = n1%n2;
			}
			else {
				n2 = n2%n1;
			}
		}
		if(n1!=0) {
			return n1;
		}
		else {
			return n2;
		}
	}

}
