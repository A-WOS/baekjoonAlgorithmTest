package bronze2;

import java.util.Scanner;

public class no10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n_th= sc.nextInt();

        System.out.println(pibo(n_th));
    }

    static int pibo(int n){
        if(n<=1)
            return n;

        return pibo(n-2) + pibo(n-1);
    }
}
