package step18;

import java.util.Scanner;
import java.util.Stack;

public class no10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int K = sc.nextInt();
        int tot =0;
        for(int i=0; i<K; i++){
            int n = sc.nextInt();

            if (n==0)
                stack.pop();
            else
                stack.push(n);

        }
        for (int i : stack) {
            tot += i;
        }

        System.out.println(tot);
    }
}
