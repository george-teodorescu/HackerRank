package datastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

    private static int[] manipulateArray(int[] array, int a, int b, int k) {
        for (int j = 0; j < array.length; j++) {
            if (j >= a && j <= b) {
                array[j] += k;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] array = new int[n];
        for (int a0 = 0; a0 < m; a0++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            manipulateArray(array, a, b, k);
        }

        Arrays.sort(array);
        int max = array.length - 1;
        System.out.println(array[max]);

        in.close();
    }
}
