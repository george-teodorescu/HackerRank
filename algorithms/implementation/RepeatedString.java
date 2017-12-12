package implementation;

import java.util.Scanner;

public class RepeatedString {
    public static long solution(String s, long k) {
        int length = s.length();
        long count = 0;
        long result = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        long remainder = 0;
        if (k % length > 0) {
            remainder = k % length;
            long b = k / length;
            result = count * b;

            for (int j = 0; j < remainder; j++) {
                if (s.charAt(j) == 'a' || s.charAt(j) == 'A') {
                    result++;
                }
            }
        } else {
            long b = k / length;
            result = count *b;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = solution(s, n);
        System.out.println(result);
    }
}
