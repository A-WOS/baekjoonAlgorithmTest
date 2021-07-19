package others;

import java.util.Scanner;

public class no10953 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String[] sarr;
        int tot;
        for(int i=0; i<T; i++){
            String s = sc.next();
            sarr = s.split(",");
            tot=0;
            for (String value : sarr) {
                tot += Integer.parseInt(value);
            }
            System.out.println(tot);

        }
    }
}
