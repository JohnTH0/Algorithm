package prefix_sum.backjoon;

import java.util.Scanner;

public class Main_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열 숫자의 개수
        int N = sc.nextInt();
        // 구간합을 요구하는 횟수
        int M = sc.nextInt();
        int[] intArr = new int[N];
        // 배열 생성
        for (int i = 0; i < N; i++) {
            intArr[i] = sc.nextInt();
        }
        // 합배열 생성
        long[] sumArr = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            sumArr[i] = sumArr[i - 1] + intArr[i - 1];
        }

        while (M --> 0) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(sumArr[end] - sumArr[start - 1]);
        }
    }
}
