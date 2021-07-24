package others;

import java.math.BigInteger;
import java.util.Scanner;

// 백준 no2420 사파리월드
public class no2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = sc.nextBigInteger();
        BigInteger M = sc.nextBigInteger();

        BigInteger result = N.subtract(M).abs();

        System.out.println(result);
    }
}
