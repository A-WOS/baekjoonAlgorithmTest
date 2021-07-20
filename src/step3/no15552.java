package step3;

import java.io.*;
import java.util.StringTokenizer;

// 4단계 빠른 A+B
public class no15552 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int c = Integer.parseInt(br.readLine());
        for(int i=0; i<c; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) +"\n");
        }
        bw.close();
    }
}
