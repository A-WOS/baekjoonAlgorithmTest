package step9;

import java.util.Scanner;

public class no1929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        // (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력
        int[] arr = new int[1000001];

        // 소수는 2부터 시작하기 때문에 배열에도 값을 넣어주기 위해 초기화.
        for(int i=2;i<=N;i++) {
            arr[i] = i;
        }

        // i는 1부터 N까지 소수인지 판별
        for(int i=1; i<=N; i++) {
            // arr[i]의 값이 0이라면 다음 for 문으로 넘어감.
            // (arr[i]의 값이 지워졌다면)
            if(arr[i]==0) continue;

            // i의 배수 만큼 N까지 0으로 만들어버림. (지워버림)
            for(int j=2*i;j<=N; j+=i) {
                arr[j] = 0;
            }
        }

        // M부터 N까지 배열에 0이 아닌 소수를 모두 출력한다.
        for(int i=M;i<=N;i++) {
            if(arr[i]!=0){
                    System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}