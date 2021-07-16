package step8;

import java.util.Scanner;

public class no10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            System.out.println(hosu(H, W, N));
        }
    }
    // H = 층수, W = 층 마다 방 개수, N = 몇 번째 손님이 위치할 방
    public static int hosu(int H, int W, int N){
        int count=0;
        for(int i=1; i<=W; i++){
            for(int j=1; j<=H; j++){
                count++;
                // 10번째 손님이 위치할 방과 count 의 개수가 같다면 그 호수를 반환
                if(count==N){
                    return j*100+i;
                }
            }
        }
        return 0;
    }
}
