package simulation.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_76501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        // input to int[]
        String[] sArray = br.readLine().split(" ");
        int[] absolutes	 = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            absolutes[i] = Integer.parseInt(sArray[i]);
        }

        // input to boolean[]
        String[] booleanArray = br.readLine().split(" ");
        boolean[] signs = new boolean[absolutes.length];
        for (int i = 0; i < booleanArray.length; i++) {
            signs[i] = Boolean.parseBoolean(booleanArray[i]);
        }

        for (int i = 0; i < signs.length; i++) {
            absolutes[i] = signs[i] ? absolutes[i] : -1 * absolutes[i];
            result += absolutes[i];
        }

        System.out.println("result = " + result);
    }
}
