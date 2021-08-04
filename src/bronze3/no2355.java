package bronze3;

import java.util.Scanner;

public class no2355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

//        System.out.println(recur(A, B));
        System.out.println(sigma(A, B));

    }
    public static Long sigma(long A, long B){
        if(A>=B)
            return (A+B)*(A-B+1) / 2;
        else
            return (B+A)*(B-A+1) / 2;

    }

//    public static Long recur(long A, long B){
//        if(A>B){
//            return recur(A-1, B)+A;
//        }else if(A<B){
//            return recur(A, B-1)+B;
//        }else{
//            return A;
//        }
//    }
}
