package bronze3;

import java.util.Scanner;

public class no2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<2*N-1; i++){
            if(i<N) {
                for(int k=N-i-1; k>0; k--){
                    System.out.print(" ");
                }

                for (int j = 0; j <= i; j++)
                    System.out.print("*");
            }else {
                for(int k=2*N-i; k<=N; k++){
                    System.out.print(" ");
                }
                for (int j=i; j<2*N-1; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
