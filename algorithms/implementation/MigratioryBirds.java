package implementation;

import java.util.Scanner;

public class MigratioryBirds {
    private static int migratoryBirds(int n, int[] ar) {
        int []arr = new int [6];
        for(int id:ar){
            arr[id]++;
        }
        int birds = 0;
        int birdType=0;

        for(int i =1;i<6;i++){
            if(arr[i]>birds){
                birds = arr[i];
                birdType =  i;
            }
        }
        return birdType;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}


