package others;

import java.util.Scanner;

// 백준 2441 별 찍기 - 4
public class no2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=N; i>=1; i--){
            for(int k=N-i; k>=1; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
