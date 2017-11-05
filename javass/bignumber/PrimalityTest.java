package bignumber;

import java.math.*;
import java.util.Scanner;

public class PrimalityTest {

    private static String checkPrimeNumber(java.math.BigInteger n) {
        boolean flag = n.isProbablePrime(1);
        if (flag) {
            return "prime";
        }
        return "not prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.math.BigInteger n = sc.nextBigInteger();
        System.out.println(checkPrimeNumber(n));
    }
}
