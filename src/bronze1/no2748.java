package bronze1;

import java.util.Scanner;

public class no2748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(recur(n));
    }

    public static long recur(int n) {
        long[] arr = new long[91];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr[n];
    }
}
