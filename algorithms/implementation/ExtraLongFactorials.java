package implementation;


import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger factorial = BigInteger.valueOf(1);

        while (n > 0) {
            factorial = factorial.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(factorial);
    }
}
