package algorithms.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Panagrams {

    static List<String> alphabet = new ArrayList<>();

    private static String solution(String word) {
        List<String> abcdef = new ArrayList<>();
        abcdef.add(word);
        for (int i = 0; i < alphabet.size(); i++) {
            if (!abcdef.contains(alphabet.get(i))) {
                System.out.println("not panagram");
            }
        }
        return "panagram";
    }

    public static void main(String[] args) {

        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.add("d");
        alphabet.add("e");
        alphabet.add("f");
        alphabet.add("g");
        alphabet.add("h");
        alphabet.add("i");
        alphabet.add("j");
        alphabet.add("k");
        alphabet.add("l");
        alphabet.add("m");
        alphabet.add("n");
        alphabet.add("o");
        alphabet.add("p");
        alphabet.add("q");
        alphabet.add("r");
        alphabet.add("s");
        alphabet.add("t");
        alphabet.add("u");
        alphabet.add("v");
        alphabet.add("w");
        alphabet.add("x");
        alphabet.add("y");
        alphabet.add("z");

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = solution(s);
        System.out.println(result);

    }
}
