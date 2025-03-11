public class Main_12922 {
    public static void main(String[] args) {
        int n = 10;
        String answer = "";

        for (int i = 0; i < n; i++) {
            answer += (i % 2 == 0) ? "수" : "박";
        }
        System.out.println(answer);
    }
}

/* 제출 코드
class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += (i % 2 == 0) ? "수" : "박";
        }
        return answer;
    }
}
 */