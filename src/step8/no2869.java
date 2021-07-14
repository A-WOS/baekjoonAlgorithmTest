package step8;

import java.util.Scanner;

public class no2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 낮에 올라갈 수 있는 거리
        int b = sc.nextInt(); // 밤에 내려가는 거리
        int v = sc.nextInt(); // 나무막대의 높이

        int tot = a-b; // 하루에 이동하는 거리

        // 정상에 올라간 후에는 미끄러지지 않는다고 했기 때문에
        // v에서 a 거리를 먼저 빼주고 계산
        v = v - a;

        // 위에서 마지막 하루 이동하는 거리를 빼고 계산했기 때문에 결과에 하루를 더해줌.
        // 딱 나누어 떨어질 경우에는 +1
        if(v % tot == 0){
            System.out.println(v/tot + 1);
            // 나누어 떨어지지 않을 때 하루를 더 이동해야 되므로 +2
        }else{
            System.out.println(v/tot + 2);
        }
    }
}
