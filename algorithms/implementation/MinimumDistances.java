package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumDistances {
    public static int solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    int temp = Math.abs(i - j);
                    list.add(temp);
                }
            }
        }
        if (list.isEmpty()) {
            return -1;
        } else {
            Collections.sort(list);
            return list.get(0);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for (int A_i = 0; A_i < n; A_i++) {
            A[A_i] = in.nextInt();
        }
        int result = solution(A);
        System.out.println(result);
    }
}

