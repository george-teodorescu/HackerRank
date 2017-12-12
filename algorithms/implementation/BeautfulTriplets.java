package implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class BeautfulTriplets {

    public static int solution(ArrayList<Integer> list, int d) {
    int count = 0;
    for (Integer l : list) {
        if (list.contains(l + d) && list.contains(l + 2 * d)) {
            count++;
        }
    }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int result = solution(list, d);
        System.out.println(result);
    }
}
