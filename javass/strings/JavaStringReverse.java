package strings;

import java.util.Scanner;

public class JavaStringReverse {

    public static void checkPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        if (s.equals(sb.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        checkPalindrome(A);
    }
}
