package mathematics.backjoon;

import java.util.Scanner;

public class Main_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 개행 처리 필요!
        sc.nextLine();
        int sum = 0;
        String[] sArr = sc.nextLine().split("");
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(sArr[i]);
        }
        System.out.println(sum);
    }
}

/* 간소화 버전
public class Main_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        char[] chArr = sc.next().toCharArray();
        for (char c : chArr) {
            sum += c - '0';
        }
        System.out.println(sum);
    }
}
*/
