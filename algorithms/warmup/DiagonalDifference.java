package algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
    private static int result(int[][] array) {
        int sumDiagonal_1 = 0;
        for (int i = 0; i < array.length; i++) {
            sumDiagonal_1 += array[i][i];
        }

        int sumDiagonal_2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1 - i; j >= 0; j++) {
                sumDiagonal_2 += array[i][j];
                break;
            }
        }
        return Math.abs(sumDiagonal_1 - sumDiagonal_2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = result(a);
        System.out.println(result);

    }
}


