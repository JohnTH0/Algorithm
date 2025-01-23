import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_68935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String triN = Integer.toString(n,3);
        System.out.println("triN = " + triN);

        StringBuilder sb = new StringBuilder();

        for (int i = triN.length()-1; i >= 0; i--) {
            sb.append(triN.charAt(i));
        }
        System.out.println("sb = " + sb);
        System.out.println(Integer.parseInt(sb.toString(), 3));
    }
}
