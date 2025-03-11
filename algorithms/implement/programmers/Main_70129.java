package implement.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_70129 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long loopCount = 0;
        long zeroCount = 0;
        int[] answer = new int[2];

        // s의 길이가 1이면 종료
        while (s.length() != 1) {

            // 0의 개수를 확인
            zeroCount += getZeroCount(s);

            // 0을 제거
            s = s.replaceAll("0", "");

            // s의 길이
            int sLength = s.length();

            // 길이 값을 2진수로 변환 후 해당값을 사용
            s = convertBinary(sLength);

            loopCount++;
        }

        answer[0] = (int) loopCount;
        answer[1] = (int) zeroCount;

        System.out.println("loopCount = " + loopCount);
        System.out.println("zeroCount = " + zeroCount);

    }

    public static long getZeroCount (String str){
        return str.chars()
                .filter(x -> x == '0')
                .count();
    }

    public static String convertBinary (int sLength){
        return Integer.toBinaryString(sLength);
    }
}
