package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String addToList(String s, int k) {
        List<String> substrings = new ArrayList<>();
        for (int j = 0; j < k; j++) {
            for (int i = j; i < s.length() - j; i += k) {
                if (i + k > s.length()) {
                    break;
                }
                substrings.add(s.substring(i, i + k));
            }
        }
        Collections.sort(substrings);
        int listSize = substrings.size();
        String smallest = substrings.get(0);
        String largest = substrings.get(listSize - 1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String result = addToList(s, k);
        System.out.println(result);
    }
}

