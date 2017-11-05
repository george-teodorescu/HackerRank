package introduction;

import java.util.Scanner;

public class JavaLoops2 {

    static void solution(int a, int b, int n) {
        int[] array = new int[n];
        int sum = a;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(2,i) * b;
            array[i] = sum;
        }
        for (int m : array) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            solution(a,b,n);
        }
    }
}
