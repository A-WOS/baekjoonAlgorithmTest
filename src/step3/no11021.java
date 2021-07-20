package step3;

import java.io.*;
import java.util.StringTokenizer;

// 7단계 A+B - 7
public class no11021 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int c = Integer.parseInt(br.readLine());
        for(int i=1; i<=c; i++){
            st = new StringTokenizer(br.readLine());
            bw.write("Case #" + i + ": " +
                    (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.close();
    }
}
