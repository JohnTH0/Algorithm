import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main_340198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] mats = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt) // 문자열을 정수로 변환
                .toArray();

        ArrayList<Integer> arr = new ArrayList<>();

        Arrays.sort(mats);
        System.out.println(Arrays.toString(mats));

        String[][] park = new String[][]{{"A", "A", "-1", "B", "B", "B", "B", "-1"},
                                        {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                                        {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                                        {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                                        {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                                        {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};

        // 공원의 가로, 세로 길이
        int rows = park.length;
        int cols = park[0].length;
        int[][] prefixParkSum = new int[rows][cols];

        // for loop으로 누적합 계산(빈 공간이면 1, 아니면 0)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentPath = park[i][j].equals("-1") ? 1 : 0;

                prefixParkSum[i][j] = currentPath
                            + (i > 0 ? prefixParkSum[i-1][j] : 0)
                            + (j > 0 ? prefixParkSum[i][j-1] : 0)
                            - (i > 0 && j > 0 ? prefixParkSum[i-1][j-1] : 0);
            }
        }
//        System.out.println(prefixParkSum[rows-1][cols-1]);
//        System.out.println(Arrays.deepToString(prefixParkSum));

        for (int mat : mats){
            for (int i = 0; i <= rows - mat; i++) {
                for (int j = 0; j <= cols - mat; j++) {
                    int x1 = i;
                    int y1 = j;
                    int x2 = i + mat - 1;
                    int y2 = j + mat - 1;

                    int areaSum = prefixParkSum[x2][y2]
                            - (x1 > 0 ? prefixParkSum[x1 - 1][y2] : 0)
                            - (y1 > 0 ? prefixParkSum[x2][y1 - 1] : 0)
                            + (x1 > 0 && y1 > 0 ? prefixParkSum[x1 - 1][y1 - 1] : 0);

                    if (areaSum == mat * mat) {
                        arr.add(mat);
                    }
                }
            }
        }
        int result = (arr == null || arr.isEmpty()) ? -1 : Collections.max(arr);
        System.out.println(result);
    }
}

/* 제출 코드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] mats, String[][] park) {

        ArrayList<Integer> arr = new ArrayList<>();
        int rows = park.length;
        int cols = park[0].length;
        int[][] prefixParkSum = new int[rows][cols];

        Arrays.sort(mats);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentPath = park[i][j].equals("-1") ? 1 : 0;

                prefixParkSum[i][j] = currentPath
                            + (i > 0 ? prefixParkSum[i-1][j] : 0)
                            + (j > 0 ? prefixParkSum[i][j-1] : 0)
                            - (i > 0 && j > 0 ? prefixParkSum[i-1][j-1] : 0);
            }
        }

        for (int mat : mats){
            for (int i = 0; i <= rows - mat; i++) {
                for (int j = 0; j <= cols - mat; j++) {
                    int x1 = i;
                    int y1 = j;
                    int x2 = i + mat - 1;
                    int y2 = j + mat - 1;

                    int areaSum = prefixParkSum[x2][y2]
                            - (x1 > 0 ? prefixParkSum[x1 - 1][y2] : 0)
                            - (y1 > 0 ? prefixParkSum[x2][y1 - 1] : 0)
                            + (x1 > 0 && y1 > 0 ? prefixParkSum[x1 - 1][y1 - 1] : 0);

                    if (areaSum == mat * mat) {
                        arr.add(mat);
                    }
                }
            }
        }
        int result = (arr == null || arr.isEmpty()) ? -1 : Collections.max(arr);
        return result;
    }
}
 */