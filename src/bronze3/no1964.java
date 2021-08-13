package bronze3;

import java.math.BigInteger;
import java.util.Scanner;

public class no1964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(recurOctagon(N));
    }

    public static BigInteger recurOctagon(int N) {

        BigInteger firstIndex = BigInteger.valueOf(5);
        BigInteger secondIndex = BigInteger.valueOf(7);
        BigInteger fixedValue = BigInteger.valueOf(3);

        for(int i=2; i<=N; i++){
            firstIndex = firstIndex.add(secondIndex);
            secondIndex = secondIndex.add(fixedValue);
            firstIndex = firstIndex.mod(BigInteger.valueOf(45678));

        }
        return firstIndex;
    }
}
