package arithmetic.programmers;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main_12954 {
    public static void main(String[] args) {
//        필요한 변수 선언
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.printf("x 값: %d", x);
        int n = scanner.nextInt();
        System.out.printf("n 값: %d", n);

        System.out.println(Main_12954.solution(x,n));
    }

    public static List<Long> solution(int x, int n) {
//        결과값을 담을 변수 선언
        List<Long> result = new ArrayList<>();

//        반복문을 돌리면서 List에 값을 추가
        for (int i = 1; i <= n; i++) {
            result.add((long)x * i);
        }
        return result;
    }
}

/* 제출 코드
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Long> solution(int x, int n) {
        List<Long> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add((long)x * i);
        }
        return result;
    }
}
*/