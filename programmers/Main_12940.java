import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int gcd = gcd(n, m);
        int lcm =(n * m) / gcd;

        int[] result = new int[2];
        result[0] = gcd;
        result[1] = lcm;

        System.out.println("gcd = " + gcd);
        System.out.println("lcm = " + lcm);


    }
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}

/* 풀이
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = 1; i < n + m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }
        return answer;
    }

}
*/