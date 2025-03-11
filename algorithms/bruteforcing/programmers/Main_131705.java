package bruteforcing.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_131705 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int count = 0;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                for (int k = j + 1; k < intArr.length; k++) {
                    if(intArr[i] + intArr[j] + intArr[k] == 0) {
                        count++;
                    }
                }
            }
        }
    }
}

/* 잘못된 풀이(투 포인터)
import java.util.Arrays;

class Solution {
    public int solution(int[] number) {
        Arrays.sort(number);
        int count = 0;
        for(int i = 0; i< number.length - 2; i ++){
            int start = i + 1;
            int end = number.length - 1;

            while(start < end){
                if(number[i] + number[start] + number[end] == 0){
                    count ++;
                    start++;
                    end--;
                }else if(number[i] + number[start] + number[end] < 0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return count;
    }
}
 */