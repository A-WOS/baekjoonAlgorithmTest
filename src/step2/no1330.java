package step2;

import java.util.Scanner;

// 1단계 두 수 비교하기
public class no1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b)
            System.out.println(">");
        else if(a == b)
            System.out.println("==");
        else
            System.out.println("<");
    }
}
