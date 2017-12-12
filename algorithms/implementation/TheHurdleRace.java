package implementation;

import java.util.Scanner;

public class TheHurdleRace {
    public static int hurdles(int[] height, int k) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] - k > max) {
                max = height[i] - k;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdles(height, k);
        System.out.println(result);
    }
}

