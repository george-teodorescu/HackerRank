package implementation;

import java.util.Scanner;

public class DrawingBook {
    public static int solve(int n, int p){
        int result = 0;
        int front = p/2;
        int back = (n/2 - p/2);
        if(front < back) {
            result = front;
        } else {
            result = back;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}

