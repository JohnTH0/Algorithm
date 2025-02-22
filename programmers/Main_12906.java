import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_12906 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] srtArr = br.readLine().split(" ");
        int[] intArr = new int[srtArr.length];
        for (int i = 0; i < srtArr.length; i++) {
            intArr[i] = Integer.parseInt(srtArr[i]);
        }
        ArrayList<Integer> intArrList = new ArrayList<>();

        int previousNum = -1;

        for (int num : intArr){
            if (num != previousNum){
                intArrList.add(num);
                previousNum = num;
            }
        }

        int[] intArray = intArrList.stream().mapToInt(Integer::intValue).toArray();
    }
}
