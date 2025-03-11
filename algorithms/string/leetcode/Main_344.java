package string.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] s = input.toCharArray();
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tempChar = s[left];
            s[left] = s[right];
            s[right] = tempChar;
            left ++;
            right --;
        }
        System.out.println("Arrays.toString(s) = " + Arrays.toString(s));
    }
}
