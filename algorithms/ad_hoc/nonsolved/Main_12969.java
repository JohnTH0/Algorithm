// https://school.programmers.co.kr/learn/courses/30/lessons/12969

package ad_hoc.nonsolved;

import java.util.Scanner;

public class Main_12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        int count = 0;

        while (count < b){
            sb.append("*".repeat(Math.max(0, a)));
            sb.append("\n");
            count ++;
        }
        System.out.println(sb);
    }
}
