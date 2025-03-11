// https://school.programmers.co.kr/learn/courses/30/lessons/12943

package recursion.nonsolved;

public class Main_12943 {
    public static void main(String[] args) {
        int num = 626331;
        int result = 0;

        while (num != 1 && result < 500) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            result++;
        }

        System.out.println(num == 1 ? result : -1);
    }
}

/* 제출 코드
class Solution {
    public int solution(long num) {
        int result = 0;

        while (num != 1 && result < 500) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            result++;
        }
        return num == 1 ? result : -1;
    }
}
 */
