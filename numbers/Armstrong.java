package numbers;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		IsArmStrong(n);
	}

	public static void IsArmStrong(int n) {
		int count = countDigits(n);
		int temp = n;
		int prod = 0;
		while(n>0) {
			int last = n%10;
//			prod = prod+ (int)Math.pow(last, count);
			prod = prod + power(last,count);
			n = n/10;
		}
		System.out.println(temp == prod ? "Armstrong" : "Not Armstrong");
	}
	
	public static int power(int last, int count) {
		int prod = 1;
		for(int i=0; i<count; i++) {
			prod = prod*last;
		}
		return prod;
	}

	public static int countDigits(int n) {
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
	}

}
