package strings;

import java.util.Scanner;

public class HackerRankInAString {
    public static String solution(String s) {
        String v = "hackerrank";
        if (s.length() < v.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < v.length() && s.charAt(i) == v.charAt(j)) {
                j++;
            }
        }
        return (j == v.length() ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            String result = solution(s);
            System.out.println(result);
        }
    }
}
