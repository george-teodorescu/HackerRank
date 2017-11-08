package implementation;

import java.util.Scanner;

public class ApplesAndOranges {
    private static int[] getNumbers(int s, int t, int a, int b, int[] apple, int[] orange) {
        int minApple = s - a;
        int maxApple = t - a;
        int minOrange = t - b;
        int maxOrange = s - b;
        int[] result = new int[2];

        for (int i = 0; i < apple.length; i++) {
            if (apple[i] >= minApple && apple[i] <= maxApple) {
                result[0]++;
            }
        }

        for (int i = 0; i < orange.length; i++) {
            if (orange[i] <= minOrange && orange[i] >= maxOrange) {
                result[1]++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
        int[] results = getNumbers(s, t, a, b, apple, orange);
        for (int res : results) {
            System.out.println(res);
        }
    }
}
