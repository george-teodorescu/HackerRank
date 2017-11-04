package algorithms.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {

    private static void miniMaxSum(int[] array) {

        List<Integer> list = new ArrayList<>();

        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            list.add(array[i]);
        }

        Collections.sort(list);

        long maxSum = sum -list.get(0);
        int minimum = list.size() - 1;
        long miniSum = sum - list.get(minimum);

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
