/*배열 d와 예산 budget이 매개변수로 주어질 때,
최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.*/

import java.util.Arrays;

public class main_12982 {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int total = 0;
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (total < budget && total + d[i] <= budget){
                total += d[i];
                answer ++;
            }else{
                break;
            }
        }
        System.out.println(answer);
    }
}

/* 제출 코드
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int total = 0;
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (total < budget && total + d[i] <= budget){
                total += d[i];
                answer ++;
            }else{
                break;
            }
        }
        return answer;
    }
}
 */
