package step3;

import java.util.Scanner;

// 11단계 X보다 작은 수
public class no10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int arr[] = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < X)
                System.out.print(arr[i]+" ");
        }

    }
}
