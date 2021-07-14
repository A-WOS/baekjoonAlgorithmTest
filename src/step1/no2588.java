package step1;

import java.util.Scanner;

// 11단계 곱셈
public class no2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;

        int[] arr = new int[3];
        int[] arr2 = new int[3];
        int[] tot = new int[3];

        for(int i=2; i>-1; i--){
            arr[i] = b/(int)Math.pow(10,i);
            b-=arr[i]*(int)Math.pow(10,i);
        }
        arr2[0] = arr[2];
        arr2[1] = arr[1];
        arr2[2] = arr[0];
        for(int j=2; j>-1; j--)
            tot[j] = a*arr2[j];
        for(int i=2; i>-1; i--)
            System.out.println(tot[i]);
        arr2[0] = tot[2];
        arr2[1] = tot[1];
        arr2[2] = tot[0];
        for(int i=2; i>-1; i--) {
            c += arr2[i] * (int) Math.pow(10, i);
        }
        System.out.println(c);
    }
}
