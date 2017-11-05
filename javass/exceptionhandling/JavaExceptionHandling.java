package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
