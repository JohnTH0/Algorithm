package sorting.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_88 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String[] sArr = br.readLine().split(" ");
        int[] nums1 = new int[sArr.length];
        for (int i = 0; i < m; i++) {
            nums1[i] = Integer.parseInt(sArr[i]);
        }

        String[] sArr2 = br.readLine().split(" ");
        int[] nums2 = new int[sArr2.length];
        for (int i = 0; i < n; i++) {
            nums2[i] = Integer.parseInt(sArr2[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[j] == 0){
                    nums1[j] = num;
                    break;
                }
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
