package mathematics.programmers;

import java.util.Scanner;

public class Main_87389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("n 값: %d \n", n);

        System.out.printf("x 값: %d",solution(n));
    }

    public static int solution(int n){
        int x = 0;
        if (n % 2 == 0){
            int k = n - 1;
            for (int i = 2; i <= k; i++){
                if (k % i == 0){
                    x = i;
                    break;
                }
            }
        } else {
                x = 2;
        }
        return x;
    }
}

/* 제출코드
class Solution {
    public int solution(int n) {
        int x = 0;
        if (n % 2 == 0){
            int k = n - 1;
            for (int i = 2; i <= k; i++){
                if (k % i == 0){
                    x = i;
                    break;
                }
            }
        } else {
           x = 2;
        }
        return x;
    }
}
 */