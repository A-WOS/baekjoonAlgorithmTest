package bronze3;

import java.util.Scanner;

public class no2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(divisor(N,K));
    }

    public static int divisor(int N, int K){
        int[] arr = new int[N];

        int n_count=0;
        for(int i=0; i<N; i++){
            if (N % (i+1) == 0){
                arr[i] = i+1;
                System.out.println(arr[i]);
                n_count++;
            }
        }
        if(n_count < K)
            return 0;
        int[] count = new int[n_count];
        int j=0;
        for(int i : arr){
            if(i != 0){
                count[j] = i;
                j++;
            }
        }

        return count[K-1];
    }
}
