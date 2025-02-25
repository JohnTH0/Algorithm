package Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_12891 {
    static int[] checkArr;
    static int[] myArr;
    static int checkSecret;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        // 부분 문자열의 길이
        int P = Integer.parseInt(st.nextToken());
        int Result = 0;
        char[] A = new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;
        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            // 각 문자 A C G T의 최소 필요개수가 0 이라면 검증값 증가
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }

        // 첫 부분 문자열 확인
        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }

        if (checkSecret == 4) {
            Result++;
        }

        // 앞으로 한칸씩 이동하면서 새로들어온 문자랑 나가는 문자를 처리
        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(A[j]);
            Remove(A[j]);
            // 계산한 결과값 확인
            if (checkSecret == 4) {
                Result++;
            }
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) {
                    checkSecret--;
                }
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) {
                    checkSecret--;
                }
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) {
                    checkSecret--;
                }
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) {
                    checkSecret--;
                }
                break;
        }
    }
}
