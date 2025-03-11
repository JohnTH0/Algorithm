package sorting.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_12941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arrA = createIntArray(br.readLine());
        int[] arrB = createIntArray(br.readLine());
        int arrayLength = arrA.length;

        long result = 0;

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for (int i = 0; i < arrA.length; i++) {
            result += (long) arrA[i] * arrB[arrayLength - 1 - i];
        }
        System.out.println("result = " + result);



    }
    public static int[] createIntArray(String input) {
        String[] strArr = input.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        return arr;
    }
}
