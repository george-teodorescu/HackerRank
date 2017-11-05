package datastructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        List<Integer> numberList = new LinkedList<>();

        for (int i = 0; i < arraySize; i++) {
            int number = sc.nextInt();
            numberList.add(number);
        }

        int numberOfOperations = sc.nextInt();
        for (int j = 0; j < numberOfOperations; j++) {
            sc.nextLine();
            String operation = sc.nextLine();

            if (operation.equals("Insert")) {
                int index = sc.nextInt();
                int number = sc.nextInt();
                numberList.add(index, number);
            }

            if (operation.equals("Delete")) {
                int index = sc.nextInt();
                numberList.remove(index);
            }
        }
        for (int l : numberList) {
            System.out.print(l + " ");
        }
    }
}

