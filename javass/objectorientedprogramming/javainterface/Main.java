package objectorientedprogramming.javainterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(myCalculator);
        System.out.println(myCalculator.divisor_sum(n) + "\n");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
