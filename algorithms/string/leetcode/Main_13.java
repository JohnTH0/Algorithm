package string.leetcode;

/*
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main_13 {
    public static void main(String[] args) throws IOException {

        Map<Character, Integer> romanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 주어진 문자열을 변환하여 담기 위한 리스트 선언
        List<Integer> list = new ArrayList<>();

        // 결과값
        int romanSum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            list.add(romanMap.get(c));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            // 현재 값이 다음 값보다 작으면 빼야 함
            if (i + 1 < list.size() && list.get(i) < list.get(i + 1)) {
                romanSum -= list.get(i); // 빼기
            } else {
                romanSum += list.get(i); // 더하기
            }
        }
        System.out.println(romanSum);
    }
}

/* 제출코드
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        // 주어진 문자열을 변환하여 담기 위한 리스트 선언
        List<Integer> list = new ArrayList<>();

        // 결과값
        int romanSum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            list.add(romanMap.get(c));
        }
        for (int i = 0; i < list.size(); i++) {
            // 현재 값이 다음 값보다 작으면 빼야 함
            if (i + 1 < list.size() && list.get(i) < list.get(i + 1)) {
                romanSum -= list.get(i); // 빼기
            } else {
                romanSum += list.get(i); // 더하기
            }
        }
        return romanSum;

    }
}
 */
