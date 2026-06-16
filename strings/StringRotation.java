package strings;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(checkRotation(s1,s2));
    }
    public static boolean checkRotation(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String temp = s1+s1;
        return temp.contains(s2);
    }
}
