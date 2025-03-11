// https://school.programmers.co.kr/learn/courses/30/lessons/138477

package priority_queue.nonsolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_138477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sArray = br.readLine().split(" ");
        int k = Integer.parseInt(br.readLine());
        int[] score = new int[sArray.length];
        int[] solArray = new int[sArray.length];
        List<Integer> rank = new ArrayList<>();

        for (int i = 0; i < sArray.length; i++) {
            score[i] = Integer.parseInt(sArray[i]);
        }

        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }
            solArray[i] = Collections.min(rank);
        }
    }
}
/* 제출 코드
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] solArray = new int[score.length];
        List<Integer> rank = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }
            solArray[i] = Collections.min(rank);
        }
        return solArray;
    }
}
 */