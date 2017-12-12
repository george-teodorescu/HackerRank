package implementation;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class LibraryFine {

    public static int solution(int da, int ma, int ya, int de, int me, int ye) {
        if (ye < ya) return 10000;
        if (ye > ya) return 0;

        if (me < ma) return 500 * (ma-me);
        if (me > ma) return 0;

        if (de < da) return 15 * (da-de);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayReturned = sc.nextInt();
        int monthReturned = sc.nextInt();
        int yearReturned = sc.nextInt();
        int dayExpected = sc.nextInt();
        int monthExpected = sc.nextInt();
        int yearExpected = sc.nextInt();
        int result = solution(dayReturned,monthReturned,yearReturned,dayExpected,monthExpected,yearExpected);
        System.out.println(result);
    }
}
