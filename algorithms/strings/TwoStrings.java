package strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {
    public static String twoStrings(String s1, String s2){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
        }
        for (int j = 0; j < s2.length(); j++) {
            set2.add(s2.charAt(j));
        }

        if (s1.length() < s2.length()) {
            Iterator<Character> it1 = set1.iterator();
            while (it1.hasNext()) {
                if (set2.contains(it1.next())) {
                    return "YES";
                }
            }
        } else if (s1.length() >= s2.length()) {
            Iterator<Character> it2 = set2.iterator();
            while(it2.hasNext()) {
                if (set1.contains(it2.next())) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}

