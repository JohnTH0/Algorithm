package implement.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_53 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력값 만들기
        String[] sArray = br.readLine().split(" ");
        int[] nums = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            nums[i] = Integer.parseInt(sArray[i]);
        }

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                // 현재 값이 이전 부분합에 더한 값보다 크다면 시작점 이동
                currentSum = nums[i];
            } else {
                // 현재 값을 기존 부분합에 이어서 추가
                currentSum += nums[i];
            }

            // 최대 부분합 갱신
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("maxSum = " + maxSum);
    }
}

/* 제출 코드
class Solution {
    static{
        for(int i=0; i<500; i++){
            maxSubArray(new int[]{0});
        }
    }
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            maxSum = currentSum > maxSum ? currentSum : maxSum;

            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
 */