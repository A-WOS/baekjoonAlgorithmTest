package step2;

import java.util.Scanner;

// 5단계 알람 시계
public class no2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int a = minute - 45;

        if(a < 0){
            if(hour==0){
                hour=23;
                a = minute + 15;
                System.out.println(hour+" "+a);
            }else{
                hour = hour - 1;
                a = minute + 15;
                System.out.println(hour+" "+a);
            }
        }else{
            System.out.println(hour+" "+a);
        }
    }
}
