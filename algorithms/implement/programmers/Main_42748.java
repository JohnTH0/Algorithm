package implement.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_42748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] tempArr = Arrays.copyOfRange(arr, commands[i][0] - 1, (commands[i][1]));
            Arrays.sort(tempArr);
            result[i] = tempArr[commands[i][2] - 1];
        }
        System.out.println(Arrays.toString(result));
    }
}
