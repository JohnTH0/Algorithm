// https://leetcode.com/problems/valid-palindrome/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;

public class Main_125 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        LinkedList<String> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                stack.add(Character.toString(c).toLowerCase());
            } else if (Character.isDigit(c)) {
                stack.add(Character.toString(c));
            }
        }

        while (stack.size() > 1) {
            if (!Objects.equals(stack.getFirst(), stack.getLast())) {
                System.out.println("False");
                System.exit(0);
            }
            stack.removeFirst();
            stack.removeLast();
        }
        System.out.println("True");
    }
}

/* 제출코드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;

class Solution {
    public boolean isPalindrome(String s) {
        LinkedList<String> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                stack.add(Character.toString(c).toLowerCase());
            } else if (Character.isDigit(c)) {
                stack.add(Character.toString(c));
            }
        }
        while (stack.size() > 1) {
            if (!Objects.equals(stack.getFirst(), stack.getLast())) {
                return false;
            }
            stack.removeFirst();
            stack.removeLast();
        }
        return true;

    }
}
 */
