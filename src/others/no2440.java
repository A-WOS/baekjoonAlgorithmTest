package others;

import java.util.Scanner;

// 백준 2440 별 찍기 - 3
public class no2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=N-1; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
