package arrays;

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar =new int[n];
        for(int i=0; i<ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        twoSumPair(ar,k);
    }

    public static void twoSumPair(int[] ar, int k){
        for(int i=0; i<ar.length; i++) {

            for(int j=i+1; j<ar.length; j++) {

                if(ar[i] + ar[j] == k) {

                    System.out.println("[" + i + "," + j + "]");
                    return;
                }
            }
        }
    }
}
