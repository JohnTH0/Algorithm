package implement.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_189 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int k = Integer.parseInt(br.readLine());
        // 이동하면 되는 인덱스
        k = k % (nums.length);

        // 움직인 결과를 저장할 배열 생성
        int[] result = new int[nums.length];

        // 값 저장
        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }

        System.arraycopy(result, 0, nums, 0, result.length);

        System.out.println(Arrays.toString(nums));
    }
}
