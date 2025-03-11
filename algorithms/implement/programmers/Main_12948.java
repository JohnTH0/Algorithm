package implement.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String phoneNumber = br.readLine();
        int phoneNumberLength = phoneNumber.length();
        System.out.println("phoneNumberLength = " + phoneNumberLength);
        StringBuilder sb = new StringBuilder(phoneNumber);
        System.out.println("sb = " + sb);

        for (int i = 0; i < phoneNumberLength - 4; i++) {
            sb.setCharAt(i,'*');
        }

        phoneNumber = sb.toString();
        System.out.println(phoneNumber);
    }
}
