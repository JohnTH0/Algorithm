import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12926 {
    static String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";

    static int alphaCheck(int n){
        return n % 26 ;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z') {
                int newAlpha = alphaCheck(upperAlphabet.indexOf(c) + n);
                sb.append(upperAlphabet.charAt(newAlpha));
            }else if (c >= 'a' && c <= 'z') {
                int newAlpha = alphaCheck(lowerAlphabet.indexOf(c) + n);
                sb.append(lowerAlphabet.charAt(newAlpha));
            }else{
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
