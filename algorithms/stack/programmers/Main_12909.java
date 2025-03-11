package stack.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_12909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        ArrayList<String> strArrayList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            strArrayList.add(String.valueOf(s.charAt(i)));
            // List의 길이가 2 이상일때
            while (strArrayList.size() >= 2){
                if (strArrayList.get(strArrayList.size() - 2).equals("(")
                && strArrayList.get(strArrayList.size() - 1).equals(")")){
                    strArrayList.subList(strArrayList.size() - 2, strArrayList.size()).clear();
                } else {
                    break;
                }
            }
        }
        System.out.println(strArrayList.isEmpty());
        System.out.println("strArrayList = " + strArrayList);
    }
}
