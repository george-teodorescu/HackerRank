package javass.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        //test data

//        int[][] arr = {
//                {1, 1, 1, 0, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {1, 1, 1, 0, 0, 0},
//                {0, 0, 2, 4, 4, 0},
//                {0, 0, 0, 2, 0, 0},
//                {0, 0, 1, 2, 4, 0}
//        };

        List<Integer> list = new ArrayList<>();

        for (int m = 0; m < arr.length - 2; m++) {
            for (int n = 0; n < arr[m].length - 2; n++) {

                int[][] hourglass = {
                        {arr[m][n], arr[m][n + 1], arr[m][n + 2]},
                        {arr[m + 1][n + 1]},
                        {arr[m + 2][n], arr[m + 2][n + 1], arr[m + 2][n + 2]}
                };

                int sum = 0;
                for (int i = 0; i < hourglass.length; i++) {
                    for (int j = 0; j < hourglass[i].length; j++) {
                        sum += hourglass[i][j];
                    }
                }
                list.add(sum);
            }
        }
        Collections.sort(list);
        int max = list.size() - 1;
        System.out.println(list.get(max));
    }
}

