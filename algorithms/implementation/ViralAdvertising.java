package implementation;

import java.util.Scanner;

public class ViralAdvertising {

    public static int solution(int days, int result, int people) {
        while (days > 0) {
            int positive = (int) Math.floor(people / 2);
            result += positive;
            people = positive * 3;
            days--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int result = 0;
        int people = 5;
        System.out.println(solution(days, result, people));
    }
}
