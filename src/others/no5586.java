package others;

import java.util.Scanner;

public class no5586 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count1=0, count2=0;

        // 배열크기를 벗어나기 때문에 -2를 해줌
        // 현재의 문자와 그 다음 첫번째 문자 두번째 문자를 비교하기 떄문에 -2를 해줌.
        for(int i=0; i<s.length(); i++){
            // 소스가 중복이 되기때문에 변수 b를 선언하여 중복코드를 방지
            boolean b = s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I';
            if(s.charAt(i) == 'J'){
                if(b)
                    count1++;

            }
            if(s.charAt(i) == 'I'){
                if(b)
                    count2++;

            }
        }

        System.out.println(count1);
        System.out.println(count2);


    }
}
