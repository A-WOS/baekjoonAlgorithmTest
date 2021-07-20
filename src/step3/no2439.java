package step3;

import java.util.Scanner;

// 10단계 별 찍기 - 2
public class no2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        // 공백이 5 - 0
        // 공백이 4개 + 별 1개
        // 공백 3 - 2
        /// 2 - 3
        int count =0;

        for(int i=1; i<=a; i++) {
            for(int k=1; k<=a-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
