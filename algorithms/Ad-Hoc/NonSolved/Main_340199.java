// https://school.programmers.co.kr/learn/courses/30/lessons/340199

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_340199 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] wallet = br.readLine().split(" ");
        String[] bill = br.readLine().split(" ");
        int cnt = 0;
        int wallet_row = Integer.parseInt(wallet[0]);
        int wallet_col = Integer.parseInt(wallet[1]);
        int bill_row = Integer.parseInt(bill[0]);
        int bill_col = Integer.parseInt(bill[1]);

        while ((wallet_row < bill_row || wallet_col < bill_col)
                && (wallet_row < bill_col || wallet_col < bill_row)) {
            if (bill_row > bill_col) {
                bill_row /= 2;
            } else {
                bill_col /= 2;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
