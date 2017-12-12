package search;

import java.util.Scanner;

public class IceCreamParlor {
    public static void solution(int dollars, int arome, int[] flavors) {
        for (int i = 0; i < arome; i++) {
            for (int j = i + 1; j < arome; j++) {
                if (flavors[i] + flavors[j] == dollars) {
                    int flavor1 = i + 1;
                    int flavor2 = j + 1;
                    System.out.println(flavor1 + " " + flavor2);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trips = sc.nextInt();
        for (int i = 0; i < trips; i++) {
            int dollars = sc.nextInt();
            int flavor = sc.nextInt();
            int[] flavors = new int[flavor];
            int j = 0;
            while (j < flavor) {
                flavors[j] = sc.nextInt();
                j++;
            }
            solution(dollars, flavor, flavors);
        }
    }
}

