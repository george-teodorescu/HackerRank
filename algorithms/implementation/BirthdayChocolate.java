package implementation;

import java.util.Scanner;

public class BirthdayChocolate {

    private static int solve(int n, int[] s, int d, int m) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int limit = i + m;
            if (limit > n) {
                break;
            }
            int sum = 0;
        for (int j = i; j < limit; j++) {
                sum += s[j];
        }
        if (sum == d) {
            ++result;
        }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        solve(n, s, d, m);
    }
}
