import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main_1_Adv {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력값 만들기
        String[] sArray = br.readLine().split(" ");
        int[] nums = new int[sArray.length];
        int[] arr = new int[2];

        for (int i = 0; i < sArray.length; i++) {
            nums[i] = Integer.parseInt(sArray[i]);
        }
        System.out.println("intArray = " + Arrays.toString(nums));

        // 목표값
        int target = Integer.parseInt(br.readLine());

        // 맵을 만들어 nums[] 배열의 각 값을 {val = idx} 형태로 저장
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            // 키값이 존재하고 그 값이 현재 값이 아닌 경우를 조회
            if (map.containsKey(remainder) && map.get(remainder) != i) {
                arr[0] = i;
                arr[1] = map.get(remainder);
                break;
            } else{
                map.put(nums[i], i);
                System.out.println("map = " + map);
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }
}

/* 제출코드
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            // 키값이 존재하고 그 값이 현재 값이 아닌 경우를 조회
            if (map.containsKey(remainder) && map.get(remainder) != i) {
                arr[0] = i;
                arr[1] = map.get(remainder);
                return arr;
            } else{
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
 */
