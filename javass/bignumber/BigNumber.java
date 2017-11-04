package javass.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

    public static String checkPrimeNumber(BigInteger n) {
        boolean flag = n.isProbablePrime(1);
        if (flag) {
            return "prime";
        }
        return "not prime";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();


    System.out.println(checkPrimeNumber(n));

}
}