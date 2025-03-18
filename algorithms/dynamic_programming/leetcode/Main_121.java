package dynamic_programming.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_121 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] prices = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            prices[i] = Integer.parseInt(input[i]);
        }

        int[] sum = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            sum[i] = prices[i + 1] - prices[i];
        }
        System.out.println(Arrays.toString(sum));

        int maxSum = sum[0];
        int currentSum = sum[0];

        for (int i = 1; i < sum.length; i++) {
            currentSum = Math.max(sum[i], currentSum + sum[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
    }
}
