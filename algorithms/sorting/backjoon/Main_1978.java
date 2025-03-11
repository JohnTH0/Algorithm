package sorting.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 != 0 || num == 2)
                .toArray();

//        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        int count = 0;
        for (int number : numbers) {
            if (isPrime(number)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
