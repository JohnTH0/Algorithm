import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_17425 {
    public static void main(String[] args) throws IOException {
        final int Max = 1_000_001;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] divisor_num_array = new long[Max];
        Arrays.fill(divisor_num_array, 1);
        long[] gx_num_array = new long[Max];
        for (int i = 2; i < Max ; i++) {
            for (int j = 1; i*j < Max ; j++) {
                divisor_num_array[i*j] += i;
            }
        }

        for (int i = 1; i < Max ; i++) {
            gx_num_array[i] = gx_num_array[i - 1] + divisor_num_array[i];
        }
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(gx_num_array[n]);
        }
    }
}
