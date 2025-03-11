// https://school.programmers.co.kr/learn/courses/30/lessons/86491

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_86491 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] sizes = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int maxW = 0;
        int maxH = 0;
        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);

            maxW = Math.max(maxW, width);
            maxH = Math.max(maxH, height);
        }
        System.out.println("maxW = " + maxW);
        System.out.println("maxH = " + maxH);
    }
}
