package implementation;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

    public static int solution(int jump, int[] walk) {
        int energy = 100;
        for (int i = 0; i < walk.length; i+=jump) {
            if (walk[i] == 0) {
                --energy;
            } else {
                energy -= 3;
            }
        }
        return energy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int jump = sc.nextInt();
        int[] walk = new int[n];
        for (int i = 0; i < n; i++) {
            walk[i] = sc.nextInt();
        }
        int result = solution(jump, walk);
        System.out.println(result);
    }
}
