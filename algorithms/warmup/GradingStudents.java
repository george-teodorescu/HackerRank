package algorithms.warmup;

import java.util.Scanner;

public class GradingStudents {

    static int[] solve(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 37) {
                int lastDigit = grades[i] % 10;
                int firstDigit = grades[i] / 10;
                if (lastDigit > 7) {
                    firstDigit += 1;
                    lastDigit = 0;
                    grades[i] = Integer.parseInt(firstDigit + "" + lastDigit);
                }
                if (lastDigit >= 3 && lastDigit < 5) {
                    lastDigit = 5;
                    grades[i] = Integer.parseInt(firstDigit + "" + lastDigit);
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
