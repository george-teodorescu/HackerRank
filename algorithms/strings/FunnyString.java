package strings;

import java.util.Scanner;

public class FunnyString {
    public static String funnyString(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        int count = 0;
        String reverse = sb.toString();
        for (int i = 1; i < s.length(); i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i-1)) == Math.abs(reverse.charAt(i) - reverse.charAt(i-1))){
                count++;
            } else {
                break;
            }
        }
        if (count == s.length()-1) {
            return "Funny";
        }
        return "Not Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}

