package bronze3;

import java.util.Scanner;

public class no21866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 주어진 문제의 값
        int[] originalScore = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        // 학생들의 입력 값
        int[] studentScore = new int[9];
        // tot = 총 점수가 100이상이면 커피O, 100미만이면 커피X
        // count = 주어진 문제의 값을 넘는게 하나라도 없으면 0, 하나라도 있다면 ++ 누적
        int tot=0, count=0;
        for(int i=0; i<originalScore.length; i++){
            studentScore[i]= sc.nextInt();
            tot+= studentScore[i];
            if(studentScore[i] > originalScore[i]){
                count++;
            }else{
                count+=0;
            }

        }
        // 총점이 100점 미만이라 커피를 못 마심.
        if(tot < 100)
            System.out.println("none");
        else{
            // count 가 0이상이라면 hacker, 커피를 마실 수 있음
            if(count > 0)
                System.out.println("hacker");
            // 아니면 정상적인 사람들(수상자들 포함), 100점을 넘어서 커피를 마실 수 있음
            else
                System.out.println("draw");
        }
        sc.close();
    }
}
