/*
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

제한 조건
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.
2	5	[2,4,6,8,10]
 */

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