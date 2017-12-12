package implementation;

import java.util.Scanner;

public class ChocolateFeast {
    public static int solution(int money, int chocolatePrice, int tradeInValue) {
        int chocolateBought = money / chocolatePrice;

        chocolateBought += chocolate(chocolateBought, tradeInValue);
        return chocolateBought;
    }

    public static int chocolate(int chocolateBought, int tradeInValue) {
        if (chocolateBought < tradeInValue) {
            return 0;
        }
        int choco = chocolateBought / tradeInValue;
        int leftOver = chocolateBought % tradeInValue;
        return choco + chocolate(choco + leftOver, tradeInValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int chocolatePrice = sc.nextInt();
            int tradeInValue = sc.nextInt();
            int result = solution(money, chocolatePrice, tradeInValue);
            System.out.println(result);
        }
    }
}

