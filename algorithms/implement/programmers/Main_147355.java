package implement.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_147355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t = br.readLine();
        String p = br.readLine();
        int tLength = t.length();
        int pLength = p.length();
        int rows = (int) Math.ceil((double) tLength / pLength);
        int count = 0;
        
        for (int i = 0; i <= tLength - pLength; i++) {
            if(Long.parseLong(t.substring(i, i+pLength)) <= Long.parseLong(p)) {
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}
