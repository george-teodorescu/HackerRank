package implementation;

import java.util.*;

public class CutTheSticks {
        public static List solution(List arr) {
            List<Integer> list = new ArrayList<>();
            while(arr.size() != 0) {
                remove(arr);
                list.add(arr.size());
                int cut = getMin(arr);
                for (int i = 0; i < arr.size(); i++) {
                    arr.set(i, (int)arr.get(i) - cut);
                }
            }
            return list;
        }

        public static int getMin(List<Integer> arr) {
        return Collections.min(arr);
        }

        public static List<Integer> remove(List<Integer> arr) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == 0) {
                    arr.remove(i);
                }
            }
            return arr;
        }



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(i);
            }
            solution(arr);
        }
    }
