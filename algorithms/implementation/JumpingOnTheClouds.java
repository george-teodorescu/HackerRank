package implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {

    public static int solution(int[] walk) {
        int moves = 0;
        for (int i = 0; i < walk.length; ) {
            if (i == walk.length - 1) break;
                if (i + 2 < walk.length && walk[i + 2] == 1) {
                    i++;
                    moves++;
                } else {
                    i += 2;
                    moves++;
                }
        }
        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] walk = new int[n];
        for (int i = 0; i < n; i++) {
            walk[i] = sc.nextInt();
        }
        int result = solution(walk);
        System.out.println(result);
    }
}
