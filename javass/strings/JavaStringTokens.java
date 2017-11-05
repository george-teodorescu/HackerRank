package strings;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.trim();
        String[] split = s.split("[^a-zA-Z]+");

        if (s.length() == 0) {
            System.out.println(0);
        } else {
            System.out.println(split.length);
            for (String words : split) {
                System.out.println(words);
            }
        }
    }
}

