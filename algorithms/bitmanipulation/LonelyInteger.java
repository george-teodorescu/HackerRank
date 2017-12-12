package bitmanipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 4, 5, 5);
        Map<Integer, Integer> numbersMap = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            Integer count = numbersMap.get(num);
            if (count == null) {
                numbersMap.put(num, 1);
            } else {
                numbersMap.put(num, count + 1);
            }
        }
        for (Integer key : numbersMap.keySet()) {
            if (numbersMap.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}

