package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
//            괄호를 입력받은 이후 char 타입으로 전환
            String parenthesesString = br.readLine();
            char[] parenthesesStringChars = parenthesesString.toCharArray();
//            VPS를 검증할 문자열
            StringBuilder sbVp = new StringBuilder();
            for (char c : parenthesesStringChars) {
                sbVp.append(c);
//            괄호를 하나씩 입력받아 전부 읽은 후 validParentheses의 길이로 VPS검증
                while (sbVp.length() >= 2 && sbVp.substring(sbVp.length() - 2).equals("()")) {
                    sbVp.delete(sbVp.length() - 2, sbVp.length());
                }
            }
            System.out.println(sbVp.length() == 0 ? "YES" : "NO");
        }
    }
}

/* STACK을 이용한 방법
import java.io.*;
import java.util.*;

public class Main_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        for (int i = 0; i < T; i++) {
            String parenthesesString = br.readLine();
            Stack<Character> stack = new Stack<>();

            boolean isValid = true; // VPS 여부를 확인하는 플래그

            for (char c : parenthesesString.toCharArray()) {
                if (c == '(') {
                    stack.push(c); // 여는 괄호는 스택에 넣기
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        isValid = false; // 스택이 비어있으면 불완전한 괄호
                        break;
                    } else {
                        stack.pop(); // 닫는 괄호는 스택에서 여는 괄호를 하나 빼기
                    }
                }
            }

            // 스택이 비어있지 않으면 여는 괄호가 남은 것이므로 유효하지 않음
            if (isValid && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

 */