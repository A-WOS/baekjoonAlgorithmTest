package step9;

import java.util.Scanner;

public class no4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 입력이 0 0 0 일때 반복문 탈출
            if(a == 0 && b == 0 && c == 0){
                break;
            } else if (isRightTriangle(a, b, c)){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        int a2 = (int)Math.pow(a, 2);
        int b2 = (int)Math.pow(b, 2);
        int c2 = (int)Math.pow(c, 2);

        // 경우의 수
        // a < b < c
        // a < c < b
        // b < a < c
        // b < c < a
        // c < a < b
        // c < b < a

        if( a < b && b < c)
            return a2 + b2 == c2;
        else if(a < c && c < b)
            return a2 + c2 == b2;
        else if(b < a && a < c)
            return b2 + a2 == c2;
        else if(b < c && c < a)
            return b2 + c2 == a2;
        else if(c < a && a < b)
            return c2 + a2 == b2;
        else if(c < b && b < a)
            return c2 + b2 == a2;
        else
            return false;
    }
}
