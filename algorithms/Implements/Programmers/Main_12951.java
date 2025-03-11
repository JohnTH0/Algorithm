import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] strArr = s.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            char c = strArr[i].charAt(0);
            if (i == 0){
                sb.append(Character.toUpperCase(c));
                continue;
            }
            if (Character.isWhitespace(c)) {
                sb.append(c);
                continue;
            }
            if (i != 0
                    && Character.isWhitespace(strArr[i-1].charAt(0))
                    && Character.isLetter(c)){
                sb.append(Character.toUpperCase(c));
                continue;
            }
            sb.append(Character.toLowerCase(c));
        }
        System.out.println(sb.toString());
    }
}
