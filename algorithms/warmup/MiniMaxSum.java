package algorithms.warmup;

import java.util.*;

public class MiniMaxSum {

    private static void miniMaxSum(int[] array) {

        TreeSet<Integer> list = new TreeSet<>();

        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            list.add(array[i]);
        }

        long maxSum = sum - list.first();
        long miniSum = sum - list.last();

        System.out.println(miniSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
    }
}
