package arrays;

import java.util.Scanner;

public class BuyAndSell {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        maxProfit(ar);
    }
    public static int maxProfit(int[] ar) {

        int minPrice = ar[0];
        int maxProfit = 0;

        for (int i = 1; i < ar.length; i++) {

            if (ar[i] < minPrice) {
                minPrice = ar[i];
            } else {
                int profit = ar[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
    }
