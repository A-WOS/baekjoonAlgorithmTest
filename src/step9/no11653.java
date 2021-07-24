package step9;

import java.util.Scanner;

public class no11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if(N == 1) {
            sc.close();
        }
        for(int i=2; i<=N; i++){

            while(N % i == 0) {
                N = N / i;
                System.out.println(i);
            }

        }
    }
}
