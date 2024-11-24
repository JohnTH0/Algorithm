import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class main_136798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int limit = Integer.parseInt(br.readLine());
        int power = Integer.parseInt(br.readLine());
        int result = 0;

        int[] numArr = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            // i 부터 i의 배수들의 배열에 값을 추가
            for (int j = i; j <= number; j += i) {
                numArr[j]++;
            }
        }
        for (int j : numArr) {
            result += (j > limit) ? power : j;
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println(result);
    }
}

/* 제출 코드
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] numArr = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                numArr[j]++;
            }
        }
        for (int j : numArr) {
            answer += (j > limit) ? power : j;
        }
        return answer;
    }
}
*/
