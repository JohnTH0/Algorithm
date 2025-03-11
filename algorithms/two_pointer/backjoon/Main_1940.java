package two_pointer.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] orcs = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            orcs[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(orcs);

        int start = 0;
        int end = orcs.length - 1;
        int count = 0;

        while (start < end) {
            if(orcs[start] + orcs[end] < M) { // 재료합이 지정 번호보다 작은 경우 => 값을 올려야 한다
                start++;
                
            } else if(orcs[start] + orcs[end] > M) { // 값이 큰 경우 => 값을 낮춰야 한다
                end--;
            }else{
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);
    }
}
