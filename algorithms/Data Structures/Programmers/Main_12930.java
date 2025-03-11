// https://school.programmers.co.kr/learn/courses/30/lessons/12930
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12930 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetter(c)) {
                if(first){
                    sb.append(Character.toUpperCase(c));
                    first = false;
                }else{
                    sb.append(Character.toLowerCase(c));
                    first = true;
                }
            }else if(Character.isWhitespace(c)) {
                sb.append(' ');
                first = true;
            }
        }
        System.out.println(sb.toString());
    }
}
