package implementation;

import java.util.Scanner;

public class ServiceLane {

    public static int solution(int s, int e, int[] arr) {
        int min = 3;
        for (int i = s; i <= e; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for (int n_i = 0; n_i < n; n_i++) {
            arr[n_i] = sc.nextInt();
        }

        for (int q_i = 0; q_i < q; q_i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int result = solution(s, e, arr);
            System.out.println(result);
        }
    }
}
