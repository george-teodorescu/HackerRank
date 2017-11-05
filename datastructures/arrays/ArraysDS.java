package arrays;

import java.util.*;

public class ArraysDS {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        for (int array : arr) {
            list.add(array);
        }

        Collections.reverse(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
