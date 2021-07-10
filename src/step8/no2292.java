package step8;

import java.util.Scanner;

public class no2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1; // 칸수 세는 count
        int range = 1; // 범위는 1부터 시작
        int increase = 1; // 6의 배수만큼 범위를 올리기위해서 사용

//        //                     범위
//        // 1 -> 1       1       1
//        // 2~7 -> 2     1       6
//        // 8~19 -> 3    6       12
//        // 20~37 -> 4   12      18
//        // 38~61 -> 5   18      24

        while (range < n) {
            increase = (count++) * 6;
            range += increase;
        }

        System.out.println(count);
    }
}
