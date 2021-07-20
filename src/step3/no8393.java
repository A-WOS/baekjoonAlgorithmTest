package step3;

import java.util.Scanner;

// 3단계 합
public class no8393 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tot = 0;

        for(int i=n; i>0; i--)
            tot += i;
        System.out.println(tot);
    }
}
