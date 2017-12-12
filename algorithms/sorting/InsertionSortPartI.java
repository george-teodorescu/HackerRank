package sorting;

import java.util.Scanner;

public class InsertionSortPartI {
    public static void solution(int[] ar) {
        int n = ar.length;
        int temp = ar[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (i == 0 && temp <= ar[0]) {
                ar[i] = temp;
                printArray(ar);
            } else if (temp <= ar[i - 1]) {

                ar[i] = ar[i - 1];
                printArray(ar);

            } else if (temp > ar[i - 1] && temp < ar[i + 1]) {
                ar[i] = temp;
                printArray(ar);
            }
        }
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        solution(ar);
    }
}
