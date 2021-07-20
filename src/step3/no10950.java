package step3;

import java.util.Scanner;

// 2단계 A+B - 3
public class no10950 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] a = new int[c];
        int[] b = new int[c];

        for(int i=0; i<c; i++){
            a[i]= sc.nextInt();
            b[i]= sc.nextInt();
        }
        for(int i=0; i<c; i++){
            System.out.println(a[i]+b[i]);
        }
    }
}
