package implementation;

import java.util.Scanner;

public class TaumAndBday {
    public static long solution(long b, long w, long cb, long cw, long convert) {
        if (cb > cw + convert) {
            return b * (cw + convert) + w * cw;
        } else if (cw > cb + convert) {
            return w * (cb + convert) + b * cb;
        } else {
            return b * cb + w * cw;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long result = solution(b, w, x, y, z);
            System.out.println(result);
        }
    }
}

