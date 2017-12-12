package strings;

import java.util.Scanner;

public class MarsExploration {

    public static int countChanges(String message) {
        String sos = "SOS";
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != sos.charAt(i % 3)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = countChanges(s);
        System.out.println(result);
    }
}

