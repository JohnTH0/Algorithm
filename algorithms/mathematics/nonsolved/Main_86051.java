// https://school.programmers.co.kr/learn/courses/30/lessons/86051

package mathematics.nonsolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_86051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sArray = br.readLine().split(" ");
        int[] numbers = new int[sArray.length];

        for (int i = 0; i < sArray.length; i++) {
            numbers[i] = Integer.parseInt(sArray[i]);
        }
        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9));
        for (int num : numbers){
            integerArrayList.removeIf(x -> x == num);
        }

        System.out.println("integerArrayList = " + integerArrayList);

        int result = integerArrayList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("result = " + result);
    }
}
