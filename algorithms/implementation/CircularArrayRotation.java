package implementation;

import java.util.Scanner;

public class CircularArrayRotation {
    public static void solution(int[] a, int k, int m) {
        for (int i = 0; i < k; i++) {
            for (int j = a.length - 1; j > 0; j--) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
        System.out.println(a[m]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            solution(a, k, m);
        }
    }
}
