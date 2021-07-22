package step9;

import java.util.Scanner;

public class no1978 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sosu=0;
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            int count = 0;
            for(int j=1; j<=a; j++){
                if(a % j == 0){
                    count++;
                }
            }
            if(count == 2) {
                sosu+=1;
            }
        }
        System.out.println(sosu);
    }
}
