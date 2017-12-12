package implementation;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {

    public static boolean isKaprekar(int num) {
        long squared = (long) num * num;
        String str = String.valueOf(squared);
        String left = str.substring(0, str.length() / 2);
        String right = str.substring(str.length() / 2);
        int numL = (left.isEmpty()) ? 0 : Integer.parseInt(left);
        int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);

        if (numR + numL == num) {
            System.out.print(num + " ");
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        boolean foundKaprekar = false;
        for (int num = s; num <= e; num++) {
            if (isKaprekar(num)) {
                foundKaprekar = true;
            }
        }
        if (!foundKaprekar) {
            System.out.println("INVALID RANGE");
        }
    }
}
