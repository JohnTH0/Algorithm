package arithmetic.backjoon;

import java.util.Scanner;

public class Main_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 시험 본 과목의 개수
        int N = sc.nextInt();
        // 개행처리
        sc.nextLine();
        // 최고점수
        int M = 0;
        // 점수 합
        int sum = 0;
        // 모든 점수를 배열에 담기
        String[] sArr = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(sArr[i]);
            // 최고점수 갱신
            if(M < Integer.parseInt(sArr[i])) {
                M = Integer.parseInt(sArr[i]);
            }
        }
        // 조작 평균 = 전체 합 * 100 / M / 과목개수
        double avg = (double) sum * 100 / M / N;
        System.out.println(avg);
    }
}