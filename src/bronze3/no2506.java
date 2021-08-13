package bronze3;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class no2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] correctProblem = new int[N];

        for(int i=0; i<N; i++){
            correctProblem[i] = sc.nextInt();
        }
        int tot=0, count=0;
        for(int i: correctProblem){
            if(i == 1) {
                count++;
                tot+= count;

            }else
                count=0;

        }
        System.out.println(tot);
    }
}
