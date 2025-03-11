// https://www.acmicpc.net/problem/11660

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2차원 배열 만들기
        // 반복문이 아니라 첫번째 좌표에서 두번째 좌표까지의 사각형 범위내의 값
        int[][] originDemention = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                originDemention[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // 원배열 출력
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(originDemention[i][j]);
            }
            System.out.println();
        }

        int[][] sumDemention = new int[N + 1][N + 1];
        // 원배열에서 해당 좌표의 값 + 해당좌표 위쪽의 값 + 해당좌표 왼쪽의 값 - 해당좌표 왼쪽위의 값
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                sumDemention[i][j] = originDemention[i][j] + sumDemention[i - 1][j] + sumDemention[i][j - 1] - sumDemention[i - 1][j - 1];
            }
        }

        // 합배열 출력
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(sumDemention[i][j]);
            }
            System.out.println();
        }

        while (M --> 0){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            // 0,0부터 x2,y2까지의 구간합에서 x1 - 1 행 - y1 - 1행 + (x - 1)(y - 1)중복으로 뺀 좌표
            System.out.println(sumDemention[x2][y2] + sumDemention[x1 - 1][y1 - 1] - sumDemention[x1 - 1][y2] - sumDemention[x2][y1 - 1]);
        }

    }
}
