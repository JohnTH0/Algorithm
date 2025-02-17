package Book;

import java.util.Scanner;

public class Main_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 입력값을 String 변수에 그대로 저장
        String s = sc.next();

        // 문자열 s를 char 배열형으로 변환
        char[] cArr = s.toCharArray();

        int sum = 0;
        for (char c : cArr) {
            // char 타입 값에 - '0' 을 해서 정수형으로 변환
            sum += c - '0';
        }
        System.out.println(sum);
    }
}

/* 개인적인 생각
    내가 푼 방법의 경우, 개행 처리가 추가로 필요하다는 점에서
    조금 더 불안전한 느낌
    문자 하나만 담는데 char 대신 String을 쓴것도 조금 걸림
    char[] chars = sc.nextLine().toCharArray(); 도 가능
*/
