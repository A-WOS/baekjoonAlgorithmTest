package step3;

import java.util.Scanner;

// 1단계 구구단
public class no2739 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=1; i<10; i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
}
