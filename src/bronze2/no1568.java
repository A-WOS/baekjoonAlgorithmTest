package bronze2;

import java.util.Scanner;

public class no1568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int count = 0;

        while (N>0) {
            if(N < i)
                i = 1;
            N -= i;
            count++;
            i++;
        }
        System.out.println(count);

    }
}
