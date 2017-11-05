package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

    private static Map<Character, Integer> word1 = new HashMap<>();
    private static Map<Character, Integer> word2 = new HashMap<>();

    static boolean isAnagram(String a, String b) {
        countLetters(word1, a.toLowerCase());
        countLetters(word2, b.toLowerCase());
        return word1.equals(word2);
    }

    private static Map countLetters(Map<Character, Integer> map, String word) {
        int count = 0;
        char[] abc = word.toCharArray();
        for (int j = 0; j < abc.length; j++) {
            for (int i = 0; i < abc.length; i++) {
                if (word.charAt(j) == word.charAt(i)) {
                    count++;
                }
            }
            if (!map.containsKey(word.charAt(j))) {
                map.put(word.charAt(j), count);
            }
            count = 0;
        }
        return map;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}


