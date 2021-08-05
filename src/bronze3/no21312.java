package bronze3;

import java.util.Scanner;

public class no21312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int tot = 1;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            // 제한 조건 1 ≤ A, B, C ≤ 100
            if (1 <= arr[i] && arr[i] <= 100) {

                // 세 수중 홀수인 것들만 곱해줌.
                if (arr[i] % 2 == 1) {
                    tot *= arr[i];

                // 세 수가 모두 짝수일 때의 상황을 고려
                } else if (i == 2) {
                    if (arr[i - 2] % 2 == 0 && arr[i - 1] % 2 == 0 && arr[i] % 2 == 0){
                        tot = arr[i-2] * arr[i-1] * arr[i];
                    }
                }
            } else {
                break;
            }
        }
        System.out.println(tot);
    }

}
