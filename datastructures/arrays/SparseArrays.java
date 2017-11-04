package datastructures.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SparseArrays {

    private static void getResults(List<String> words, List<String> queries) {

        for (String q : queries) {
            int count = 0;
            for (String w : words) {
                if (q.equals(w)) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        List<String> queries = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int numberOfWords = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberOfWords; i++) {
            String word = sc.nextLine();
            words.add(word);
        }

        int numberOfQueries = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfQueries; i++) {
            String query = sc.nextLine();
            queries.add(query);
        }
        getResults(words, queries);
    }
}
