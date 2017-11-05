package exceptionhandling;

import java.util.Scanner;

public class JavaExceptionHandling2 {
    static long power(int a, int b) throws Exception {
        if (a == 0 && b == 0) {
            throw new Exception ("n and p should not be zero.");
        }
        if (a < 0 || b < 0) {
            throw new Exception ("n or p should not be negative.");
        }
        return (long)Math.pow(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                System.out.println(power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
