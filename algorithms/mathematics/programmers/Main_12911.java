package mathematics.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12911 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int binaryN = Integer.bitCount(n);
        System.out.println("binaryN = " + binaryN);

        int pointer = n + 1;
        while (true){
            if (binaryN == Integer.bitCount(pointer)){
                break;
            }else{
                pointer++;
            }
        }
        System.out.println(pointer);
    }
}

/* 시간초과
public class bitmask.programmers.Main_12911 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String binaryN = Integer.toBinaryString(n);
        System.out.println("binaryN = " + binaryN);
        int point = 1;
        int findNum = 0;
        while (true) {
            findNum = n + point;
            if (countOne(Integer.toBinaryString(n)) == countOne(Integer.toBinaryString(findNum))){
                break;
            }else{
                point ++;
            }
        }
        System.out.println("findNum = " + findNum);

    }
    public static long countOne (String n){
        long count = (int) n.chars()
                .filter(x -> x == '1')
                .count();

        System.out.println("count = " + count);

        return count;
    }
}

*/