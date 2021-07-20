package step8;

import java.util.Scanner;

public class no2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if(3<=N && N<=5000)
            System.out.println(count(N));
        else
            System.out.println("EOF");
    }

    public static int count(int N){

        int count=0;
        while(true){
            // 5kg으로 나누어 떨어질 때 count에 5kg으로 나누어떨어진 몫을 누적.
            if (N % 5 == 0) {
                count += N / 5;
                return count;
            }

            // ex) 19kg을 N으로 받았을 때 3 + 3 + 3 + 5 + 5 이므로 3으로 계속 감산하다가
            // 위의 식으로 가능하도록 만들어줌.
            N -= 3;
            count+=1;

            // ex) 6을 3으로 감산하다가 N이 0이 됬을 때 count 값을 출력
            if(N==0)
                return count;

            // ex) N이 4이거나 7일 때 -1인데... 3으로 감산하다가 음수가 되었을 때 count 값은 -1로 출력
            if(N<0){
                count = -1;
                return count;
            }

        }

    }
}
