package implement.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int tempX = x;
        int reversedNumber = 0;

        while (tempX != 0) {
            // 마지막 자리추출
            int lastDigit = Math.floorMod(tempX, 10);
            System.out.println("lastDigit = " + lastDigit);
            // 비교할 숫자값을 변경
            reversedNumber = (reversedNumber * 10) + lastDigit;
            System.out.println("reversedNumber = " + reversedNumber);
            // 마지막 자리제거
            tempX = Math.floorDiv(tempX, 10);
            System.out.println("tempX = " + tempX);
       }
        System.out.println("x = " + x);
        System.out.println(x == reversedNumber ? "True" : "False");
    }
}


/* 제출 코드
class Solution {
    public boolean isPalindrome(int x) {
        int tempX = x;
        int reversedNumber = 0;
        if (x < 0){
            return false;
        }

        while (tempX != 0) {
            // 마지막 자리추출
            int lastDigit = Math.floorMod(tempX, 10);
            // 비교할 숫자값을 변경
            reversedNumber = (reversedNumber * 10) + lastDigit;
            // 마지막 자리제거
            tempX = Math.floorDiv(tempX, 10);
       }
       return x == reversedNumber ? true : false;

    }
}
 */