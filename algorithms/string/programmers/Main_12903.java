package string.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sLength = s.length();
        String centerString;

        System.out.println("sLength = " + sLength);
        if (s.length() % 2 == 0) {
            int j = sLength / 2;
            centerString = s.substring(j - 1, j + 1);
        } else {
            int j = (sLength / 2) - 1;
            centerString = s.substring(j + 1 , j + 2);
        }
        System.out.println("centerString = " + centerString);
    }
}

/* 제출코드
class Solution {
    public String solution(String s) {
        int i = s.length();
        String answer = "";
        if (s.length() % 2 == 0) {
            int j = i / 2;
            answer = s.substring(j-1, j + 1);
        } else {
            int j = (i / 2)-1;
            answer = s.substring(j+1 , j+2);
        } return answer;
    }
}
 */
