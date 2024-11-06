import java.util.ArrayList;
import java.util.Arrays;

public class main_12935 {
    public static void main(String[] args) {
        int[] arr = new int[] {4,3,2,1};
        ArrayList<Integer> arraylist_answer = new ArrayList<>();
        int smallest_idx = arr[0];
        if (Arrays.equals(arr, new int[]{10}) || arr.length == 1){
            arraylist_answer.add(-1);
            System.out.println(arraylist_answer);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest_idx){
                smallest_idx = arr[i];
                System.out.println(smallest_idx);
            }
        }
        for (int num : arr) {
            arraylist_answer.add(num);
        }
        arraylist_answer.remove(Integer.valueOf(smallest_idx));
        System.out.println(arraylist_answer);

//        ArrayList to Array
        int[] answer = arraylist_answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

/* 제출 코드
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arraylist_answer = new ArrayList<>();
        int smallest_idx = arr[0];
        if (Arrays.equals(arr, new int[]{10}) || arr.length == 1){
            return new int[]{-1};
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest_idx){
                smallest_idx = arr[i];
            }
        }
        for (int num : arr) {
            arraylist_answer.add(num);
        }
        arraylist_answer.remove(Integer.valueOf(smallest_idx));

        int[] answer = arraylist_answer.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
 */