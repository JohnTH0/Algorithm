// https://school.programmers.co.kr/learn/courses/30/lessons/12924

package prefix_sum.nonsolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_12924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> nArrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nArrList.add(i+1);
        }
        int count = 0;
        /* two pointer 사용 */
        int start = 0;
        int end = 0;
        long sum = 0;

        // 범위: 마지막 수 까지
        while (end < nArrList.size()) {
            // 홀수인 경우 중앙 이후의 값은 계산하지 않아도 된다
            if (n % 2 != 0 && 1 < start && start >= nArrList.size()/2) {
                break;
            }
            // 합이 n보다 작은 경우 범위 증가
            if (sum < n){
                sum += nArrList.get(end);
                end ++;
            } // 합이 큰 경우 시작 점을 이동해서 범위 축소
            else if(sum > n) {
                sum -= nArrList.get(start);
                start ++;
            } // 찾은 경우, count 증가, 시작 범위 축소
            else{
                count ++;
                sum -= nArrList.get(start);
                start ++;
            }
        }
        // 자기자신과 같은 경우 추가
        count ++;
        System.out.println("count = " + count);
    }
}

/* 시간복잡도 초과(n**3)
public class Main_12924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> nArrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nArrList.add(i+1);
        }
        int count = 0;

        System.out.println("nArrList = " + nArrList);

        for (int i = 0; i < nArrList.size(); i++) {
            int pointer = 0;
            long sum = 0;

            while (sum <= n) {
                sum = nArrList.subList(i, i + pointer).stream()
                        .mapToInt(Integer::intValue)
                        .sum();

                if (sum < n){
                    pointer += 1;
                } else if(sum > n){
                    break;
                } else{
                    count += 1;
                    break;
                }
            }
        }
        System.out.println("count = " + count);
    }
}
*/
