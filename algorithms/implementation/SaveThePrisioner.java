package implementation;

import java.util.Scanner;

public class SaveThePrisioner {
    public static int solution(int n, int m, int s) {
        if ((m+s-1)%n == 0) {
            return n;
        }
        return (m+s-1)%n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = solution(n, m, s);
            System.out.println(result);
        }
    }
}
