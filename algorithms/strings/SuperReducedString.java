package strings;

import java.util.Scanner;

public class SuperReducedString {
    public static String solution(String s){
        StringBuffer sb = new StringBuffer(s);
        String result = "";
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i-1)) {
                sb.delete(i-1, i+1);
                i = 0;
            }
        }
        if (sb.length() == 0) {
            result = "Empty String";
        } else {
            result = sb.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        solution(s);
    }
}


