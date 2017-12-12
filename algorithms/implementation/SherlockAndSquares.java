package implementation;

import java.util.Scanner;

public class SherlockAndSquares {
    public static void solution(int min, int max) {
        int start = (int)Math.ceil(Math.sqrt(min));
        int end = (int)Math.floor(Math.sqrt(max)) + 1;
        System.out.println(end-start);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            solution(min, max);
        }
    }
}
