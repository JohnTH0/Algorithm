// https://school.programmers.co.kr/learn/courses/30/lessons/132267

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_132267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); // a 개당
        int b = Integer.parseInt(br.readLine()); // b 개로 바꿔줌
        int n = Integer.parseInt(br.readLine()); // 초기 빈 병
        int result = 0;
        while(n >= a){
            int trade = (n / a) * b;
            // 교환 개수
            result += trade;
            // 나머지 더하기 = 나누고 남은 값 + 교환개수
            n = (n % a) + trade;
        }
    }
}
