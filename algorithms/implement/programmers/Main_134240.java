package implement.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_134240 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < strArr.length; i++) {
            int n = Integer.parseInt(strArr[i]) / 2 ;
            sb.append(Integer.toString(i).repeat(n));
//            for (int j = 0; j < n; j++) {
//                sb.append(i);
//            }
        }
        System.out.println(sb.toString() + "0" + sb.reverse().toString());
    }
}
