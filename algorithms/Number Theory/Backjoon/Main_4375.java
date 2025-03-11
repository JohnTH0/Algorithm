import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int squareN = 1;
            int cnt = 1;
            while (squareN % n != 0) {
                squareN = (squareN * 10 + 1) % n;
                cnt ++;
            }
            System.out.println(cnt);
        }
    }
}
