package strings;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        String s = sc.nextLine();
        String[] ar = s.split(" ");
//        for(int i=0; i<n; i++){
//            ar[i] = sc.nextLine();
//        }
        commonPrefix(ar);
    }

    public static void commonPrefix(String[] ar) {
        String fw = ar[0];
        String prefix = "";
        for(int i=0; i<fw.length(); i++) {
            char ch = fw.charAt(i);
            for (int j = 1; j < ar.length; j++) {
                if (i >= ar[i].length() || ar[j].charAt(i) != ch) {
                    System.out.println(prefix);
                    return;
                }
            }
            prefix = prefix + ch;
        }
        System.out.println(prefix);
    }


//    public static void commonPrefix(String[] ar) {
//        String prefix = ar[0];
//        for(int i=1; i<ar.length;i++){
//            while(ar[i].indexOf(prefix)!=0){
//                prefix = prefix.substring(0,prefix.length()-1);
//            }
//        }
//        System.out.println(prefix);
//    }
}
