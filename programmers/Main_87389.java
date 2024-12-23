/*
자연수 n이 매개변수로 주어집니다.
n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
답이 항상 존재함은 증명될 수 있습니다.
3 ≤ n ≤ 1,000,000
*/
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