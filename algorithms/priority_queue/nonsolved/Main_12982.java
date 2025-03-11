// https://school.programmers.co.kr/learn/courses/30/lessons/12982

package priority_queue.nonsolved;

import java.util.Arrays;

public class Main_12982 {
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
