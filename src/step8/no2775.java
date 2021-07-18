package step8;

import java.util.Scanner;

public class no2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(howManyPeople(k, n));
        }

    }


    public static int howManyPeople(int k, int n) {
        // 제한은 1<=k, n <= 14이기 때문에 배열 크기를 15, 15로 만들어줌
        int[][] liveHuman = new int[15][15];

        for(int i=0; i<liveHuman.length; i++){
            // i 층의 1호에는 무조건 1이 됨...
            liveHuman[i][1] = 1;
            // 0층의 i 호에는 i명이 산다고 가정
            liveHuman[0][i] = i;
        }

        // 위에서 어느층의 1호, 0층의 i호는 이미 계산이 되었기 때문에
        // 1층의 2호부터 계산이 시작되어야함.
        for (int i = 1; i < 15; i++) {
            for (int j=2; j < 15; j++) {
                // 1층의 2호의 계산방법은 1층의 1호 + 0층의 2호이기 때문에
                // [i][j] = [i][j-1] + [i-1][j]로 볼 수 있다.
                liveHuman[i][j] = liveHuman[i][j-1] + liveHuman[i-1][j];
            }
        }

        return liveHuman[k][n];
    }
}
