package step8;

import java.util.Scanner;

public class no1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x= sc.nextInt();
        int tmp=0, cross_line=0;
        // 대각선 줄로 보면 줄하나가 생길때마다 원소가 1개씩 늘어나는 걸 볼 수 있음

        // 대각선 줄 구하는 방법
        for(int i=1; i<=x; i++){
            tmp += i;
            if(tmp >= x) {
                cross_line=i;
                break;
            }
        }

        // 대각선 줄이 홀수/짝수 개수일 때 해당하는 원소 값 구하는 방법
        if(cross_line % 2 == 1)
            System.out.println((1+tmp-x) + "/" + (cross_line-(tmp-x)));
        else
            System.out.println((cross_line-(tmp-x) + "/" +(1+tmp-x)));
    }
}
