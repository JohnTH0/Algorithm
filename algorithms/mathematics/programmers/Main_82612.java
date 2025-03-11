package mathematics.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_82612 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int price = Integer.parseInt(br.readLine());
        int money = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        long result = 0;

        long lastNumber = price + (long) (count - 1) * price;
        System.out.println("lastNumber = " + lastNumber);
        long middleNumber = (price + lastNumber) / 2 ;
        System.out.println("middleNumber = " + middleNumber);


        if (count % 2 == 0) {
            result = (price + lastNumber) * (count / 2);
        } else{
            result = (price + lastNumber) * (count / 2) + middleNumber;
        }
        System.out.println(result - money > 0 ? result - money : 0);
    }
}
