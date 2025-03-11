package arithmetic.programmers;

import java.util.Arrays;

public class Main_12950 {
    public static void main(String[] args) {
        //더미 데이터
        int[][] array1 = {
                {1, 2},
                {2, 3}
        };
        int[][] array2 = {
                {3, 4},
                {5, 6}
        };


        int[][] answer = new int[array1.length][array2[0].length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                answer[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("answer = " + Arrays.deepToString(answer));
    }
}
