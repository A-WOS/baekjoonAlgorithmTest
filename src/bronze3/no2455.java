package bronze3;

import java.util.Scanner;

// 2455번 지능형 기차
public class no2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1, tot=0;
        for(int i=0; i<4; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 4개의 역에 대해 기차에서 내린 사람 수와 탄 사람 수가 주어졌을 때, 기차에 사람이 가장 많을 때의 사람 수를 계산
            tot += b - a;

            // max로 가장 많을 때의 사람 수를 계산.
            if(max < tot){
                max = tot;
            }
        }
        System.out.println(max);
    }
}
