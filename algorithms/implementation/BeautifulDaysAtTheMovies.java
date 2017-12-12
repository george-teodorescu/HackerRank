package implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int m = i; m <= j; m++) {
            StringBuilder sb = new StringBuilder();
            sb.append(m);
            sb.reverse();
            String temp = sb.toString();
            int numb = Integer.parseInt(temp);
            if (Math.abs(m - numb) % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
