package algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

    private static void print(int[] array, int n) {
        double sumPositive = 0;
        double sumNegative = 0;
        double sumZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sumPositive += 1;
            } else if (array[i] < 0) {
                sumNegative += 1;
            } else {
                sumZero += 1;
            }
        }
        System.out.printf("%.6f", sumPositive / n);
        System.out.println();
        System.out.printf("%.6f", sumNegative / n);
        System.out.println();
        System.out.printf("%.6f", sumZero / n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        print(arr, n);
    }
}