package numbers;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(powOfTwo(n));
	}
	
	public static boolean powOfTwo(int n) {
	    if (n <= 0) {
	        return false;
	    }
	    while (n > 1) {
	        if (n % 2 != 0) {
	            return false;
	        }
	        n = n / 2;
	    }
	    return true;
	}

//	public static boolean powOfTwo(int n) {
//		int i = 0;
//		while(true) {
//			if(Math.pow(2, i) == n) {
//				return true;
//			}
//			else if(Math.pow(2, i) < n) {
//				i++;
//			}
//			else {
//				return false;
//			}
//		}
//	}

}
