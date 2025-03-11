import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main_142086 {
    public static void main(String[] args) {
        String s = "qqqq";
        int[] answer = new int[s.length()];
        ArrayList<String> word_list = new ArrayList<>(Collections.nCopies(s.length(), ""));
        for (int i = 0; i < answer.length; i++) {
            String word = s.substring(i, i + 1);
            int word_last_index = word_list.lastIndexOf(word);

            if (word_last_index == -1) {
                answer[i] = -1;
            } else{
                answer[i] = i - word_last_index;
            }
            word_list.set(i, word);
        }
        System.out.println(Arrays.toString(answer));
    }
}

/* 제출 코드
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        ArrayList<String> word_list = new ArrayList<>(Collections.nCopies(s.length(), ""));
        for (int i = 0; i < answer.length; i++) {
            String word = s.substring(i, i + 1);
            int word_last_index = word_list.lastIndexOf(word);

            if (word_last_index == -1) {
                answer[i] = -1;
            } else{
                answer[i] = i - word_last_index;
            }
            word_list.set(i, word);
        }
        return answer;
    }
}
 */