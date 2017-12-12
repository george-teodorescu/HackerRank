package implementation;

import java.util.Scanner;

public class AngryProfessor {
    public static void classIsCancelled(int k, int[] timeOfArrival) {
        int studentsOnTime = 0;
        for (int i = 0; i < timeOfArrival.length; i++) {
            if (timeOfArrival[i] <= 0) {
                studentsOnTime++;
            }
        }
        if (studentsOnTime >= k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] timeOfArrival = new int[n];
            for (int j = 0; j < n; j++) {
                timeOfArrival[j] = sc.nextInt();
            }
            classIsCancelled(k, timeOfArrival);
        }
    }
}
