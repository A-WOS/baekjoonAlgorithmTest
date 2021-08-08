package silver4;

import java.math.BigInteger;
import java.util.Scanner;

public class no10826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(recur(n));
    }

    public static BigInteger recur(int n) {
        BigInteger[] arr = new BigInteger[10001];
        arr[0] = BigInteger.valueOf(0);
        arr[1] = BigInteger.valueOf(1);

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2].add(arr[i - 1]);
        }

        return arr[n];
    }
}
