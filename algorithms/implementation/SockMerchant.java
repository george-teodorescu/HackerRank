package implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {
    public static int solution(int n, int[] ar) {
        Set<Integer> socks = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (socks.contains(ar[i])) {
                socks.remove(ar[i]);
                count++;
            } else {
                socks.add(ar[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = solution(n, ar);
        System.out.println(result);
    }
}


