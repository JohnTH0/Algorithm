package implement.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main_169 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력값 만들기
        String[] sArray = br.readLine().split(" ");
        int[] nums = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            nums[i] = Integer.parseInt(sArray[i]);
        }
        System.out.println("intArray = " + Arrays.toString(nums));

        // 배열 내 숫자 : 등장횟수
        Map<Integer, Integer> map = new HashMap<>();

        // 가장 많이 등장한 숫자
        int majorityNum = 0;
        // 가장 많이 등장한 숫자의 등장 횟수
        int majorityNumFrequency = 0;

        // getOrDefault = 최초추가 시 필요
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            // 추가한 값이 현재까지 찾은 최대수 보다 크다면 해당 숫자와 등장횟수를 갱신
            if (map.get(num) > majorityNumFrequency) {
                majorityNum = num;
                majorityNumFrequency = map.get(num);
            }
        }

        System.out.println("majorityNum = " + majorityNum);
        System.out.println("majorityNumFrequency = " + majorityNumFrequency);
    }
}

/* 제출 코드
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int majorityNum = 0;
        int majorityNumFrequency = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > majorityNumFrequency) {
                majorityNum = num;
                majorityNumFrequency = map.get(num);
            }
        }

        return majorityNum;

    }
}
 */