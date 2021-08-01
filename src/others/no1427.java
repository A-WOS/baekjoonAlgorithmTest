package others;

import java.util.Arrays;
import java.util.Scanner;

public class no1427 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[10];

        while(N != 0){
//            arr[N%10] = N%10;
            arr[N%10]++;
            N = N/10;

        }

//        Arrays.sort(arr);

        for(int j=arr.length -1; j>=0; j--){
            while(arr[j]-- > 0)
                System.out.print(j);
        }
    }

}
