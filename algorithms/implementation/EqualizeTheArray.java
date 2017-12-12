package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualizeTheArray {
    public static int solution(int[] array) {
        Map<Integer, Integer> num = new HashMap<>();
        int max = 1;
        for (int a : array) {
            if (!num.containsKey(a)) {
                num.put(a, 1);
            } else {
                num.put(a, num.get(a) + 1);
                if (max < num.get(a)) {
                    max = num.get(a);
                }
            }
        }
        return array.length - max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int result = solution(numbers);
        System.out.println(result);
    }
}

