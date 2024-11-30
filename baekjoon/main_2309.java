import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class main_2309 {
    // 포함여부를 확인하기 위한 배열 선언
    public static boolean[] visited = new boolean[9];

    // 키를 저장하기 위한 배열
    public static int[] intArr = new int[9];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(intArr);

        // 재귀함수 호출
        dfs(0, 0);
    }

    public static void dfs(int start, int depth) {
        if (depth == 7) {
            int tallSum = 0;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 9; i++) {
                if(visited[i]){
                    sb.append(intArr[i]).append("\n");
                    tallSum+=intArr[i];
                }
            }

            if (tallSum == 100) {
                System.out.println(sb.toString());
                System.exit(0);
            }
        }
        for (int i = start; i < 9; i++) {
            visited[i] = true;
            dfs(i + 1, depth + 1);

            visited[i] = false;
        }
    }
}
