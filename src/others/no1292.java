package others;

import java.util.Scanner;

// 백준 1292번 쉽게 푸는 문제
public class no1292 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[1001];
        int tot=0, count=0;
        // 일단 값을 다 채워 놓음
        for(int i=1; i<B+1; i++){
            for(int j=1; j<=i; j++){
                // ArrayIndexOutOfBoundsException 처리
                // 배열의 개수보다 i, j의 값이 더 많기 때문에 count는 배열의 크기를 초과하게 되서 에러를 발생

                if(count >= arr.length-1)
                    break;

                arr[count]=i;
                count++;

            }
        }
        // 배열은 0부터 시작이라서 3번째부터 7번째라고 가정하에
        // 배열은 arr[2] ~ arr[6]번째 이기 때문에 반복문의 조건을 아래와 같이 줌.
        for(int j=A-1; j<=B-1; j++){
            tot += arr[j];
        }

        System.out.println(tot);
    }
}
