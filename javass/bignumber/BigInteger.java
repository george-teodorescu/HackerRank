package bignumber;

import java.util.Scanner;

public class BigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        java.math.BigInteger b1 = sc.nextBigInteger();
        java.math.BigInteger b2 = sc.nextBigInteger();

        java.math.BigInteger sum = b1.add(b2);
        java.math.BigInteger product = b1.multiply(b2);

        System.out.println(sum);
        System.out.println(product);
    }
}