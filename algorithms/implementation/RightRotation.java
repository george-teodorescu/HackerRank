package implementation;

public class RightRotation {
    public static void solution(int[] a, int k, int m) {
        for (int i = 0; i < k; i++) {
            for (int j = a.length - 1; j > 0; j--) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
        array(a);

        //1 2 3 4 5
    }

    public static void array(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }

    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2;
        int m = 1;
        solution(array, k, m);
    }
}