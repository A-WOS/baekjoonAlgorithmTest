package others;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class no1427 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[10];

        int count=0;
        while(N != 0){
            arr[N%10]++;
            N = N/10;
            count++;

        }
        System.out.println(count);

        for(int j=arr.length -1; j>=0; j--){
            while(arr[j]-- > 0)
                System.out.print(j);
        }


    }

}
