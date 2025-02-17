package Book;

import java.util.Scanner;

public class Main_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 배열 생성 후 값을 대입
        int[] intArr = new int[N];
        for (int i = 0; i < N; i++) {
            intArr[i] = sc.nextInt();
        }
        // 처음부터 long type으로 생성
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
            }
            sum += intArr[i];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}
