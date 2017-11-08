package implementation;

import java.util.Scanner;

public class BreakingTheRecords {

    private static int[] getRecord(int[] s) {
        int highScore = 0;
        int lowScore = 0;
        int max = s[0];
        int min = s[0];
        for (int i = 1; i < s.length; i++) {
            if (max < s[i]) {
                max = s[i];
                highScore++;
            }
        }

        for (int i = 1; i < s.length; i++) {
            if (min > s[i]) {
                min = s[i];
                lowScore++;
            }
        }
        int[] result = {highScore, lowScore};
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}