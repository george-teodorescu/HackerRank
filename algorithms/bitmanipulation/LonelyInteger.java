package algorithms.bitmanipulation;

import java.util.*;

public class LonelyInteger {
    public static void main(String[] args) {

        //option 1

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

        //option 2

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 4, 5, 5);
//        List<Integer> uniqueNumbers = new ArrayList<>();
//        uniqueNumbers.addAll(numbers);
//
//        for (Integer i = 0; i < numbers.size() - 1; i++) {
//            for (Integer j = 1 + i; j < numbers.size(); j++) {
//                if (i == j) {
//                    continue;
//                }
//                if (numbers.get(i) == numbers.get(j)) {
//                    uniqueNumbers.remove(numbers.get(i));
//                    uniqueNumbers.remove(numbers.get(j));
//                }
//            }
//        }
//        System.out.println(uniqueNumbers);
    }
}

