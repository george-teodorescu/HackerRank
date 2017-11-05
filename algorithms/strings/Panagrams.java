package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagrams {

    private static void solution(String word) {
        Set<Character> newSet = new HashSet<>();
        String solution = word.replaceAll(" ", "").toLowerCase();
        char[] array = solution.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (!Character.isLetter(array[i])) {
                continue;
            }
            newSet.add(array[i]);
        }
        if (newSet.size() == 26) {
            System.out.println("panagram");
        } else {
            System.out.println("not panagram");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        solution(s);
    }
}
