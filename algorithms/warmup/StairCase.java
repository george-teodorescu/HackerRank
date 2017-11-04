package algorithms.warmup;

import java.util.Scanner;

public class StairCase {
    private static void buildStairs(int n) {
        int temp = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= temp) {
                    System.out.print("#");
                    continue;
                }
                System.out.print(" ");
            }
            temp--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        buildStairs(n);
    }
}
