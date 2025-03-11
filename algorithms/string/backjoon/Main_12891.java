package string.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // DNA 문자열의 길이
        int N = Integer.parseInt(st.nextToken());

        // 부분 문자열의 길이
        int M = Integer.parseInt(st.nextToken());

        int result = 0;

        // DNA 문자열
        String dnaString = br.readLine();
        // 각 문자별 최소 필요개수를 저장하기 위한 Map 생성
        Map<String, Integer> dnaMap = new HashMap<>();
        // 최소 필요개수에 대한 입력값 저장(A,C,G,T순)
        StringTokenizer dnaTokenizer = new StringTokenizer(br.readLine());

        String[] dnaAlpha = {"A", "C", "G", "T"};
        // 토큰의 개수
        int tokenCount = dnaTokenizer.countTokens();
        for (int i = 0; i < tokenCount; i++) {
            dnaMap.put(dnaAlpha[i], Integer.parseInt(dnaTokenizer.nextToken()));
        }
        
        // 비교하기 위한 값 추가
        int[] checkArr = new int[4];
        // 비교 배열에 담겨있는 첫 값을 추가
        for (int i = 0; i < M; i++) {
            updateCheckArr(checkArr, dnaString.charAt(i), 1);
        }
//        System.out.println(Arrays.toString(checkArr));

        if (isValidWindow(checkArr, dnaMap, dnaAlpha)) {
            result++;
        }
        
        // 슬라이딩 윈도우 적용
        for (int i = M; i < N; i++) {
            // 가장 왼쪽에 있는 값 제외
            updateCheckArr(checkArr, dnaString.charAt(i - M), -1);
            updateCheckArr(checkArr, dnaString.charAt(i), 1);

            if (isValidWindow(checkArr, dnaMap, dnaAlpha)) {
                result++;
            }
        }

        System.out.println(result);
    }



    public static void updateCheckArr(int[] checkArr, char c, int count) {
        if (c == 'A') {
            checkArr[0] += count;
        }else if (c == 'C') {
            checkArr[1] += count;
        }else if (c == 'G') {
            checkArr[2] += count;
        }else{
            checkArr[3] += count;
        }
    }

    public static boolean isValidWindow(int[] checkArr, Map<String, Integer> dnaMap, String[] dnaAlpha) {
        for (int i = 0; i < 4; i++) {
            if (checkArr[i] < dnaMap.get(dnaAlpha[i])) {
                return false;
            }
        }
        return true;
    }
}
