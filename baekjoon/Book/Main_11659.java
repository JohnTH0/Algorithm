package Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N과 M을 받는 토큰
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 합배열 생성
        long[] sumArr = new long[N + 1];
        // 배열을 받는 토큰
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            // 합배열 저장 (토큰 st로 저장된 개수와 N값이 같음)
            sumArr[i] = sumArr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(sumArr[j] - sumArr[i - 1]);
        }
    }
}
