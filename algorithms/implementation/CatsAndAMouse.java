package implementation;

import java.util.Scanner;

public class CatsAndAMouse {
    public static void catchMouse(int x, int y, int z) {
        if (Math.abs(z - y) < Math.abs(z - x)) {
            System.out.println("Cat B");
        }
        if (Math.abs(z - x) < Math.abs(z - y)) {
            System.out.println("Cat A");
        }
        if (Math.abs(z-x)==Math.abs(z-y)){
            System.out.println("Mouse C");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            catchMouse(x, y, z);
        }
    }
}
