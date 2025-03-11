package string.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_12917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        ArrayList<Character> lowerCharList = new ArrayList<>();
        ArrayList<Character> upperCharList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && Character.isUpperCase(s.charAt(i))) {
                upperCharList.add(s.charAt(i));
            } else{
                lowerCharList.add(s.charAt(i));
            }
        }

        lowerCharList.sort((c1, c2) -> Character.compare(c2, c1));
        upperCharList.sort((c1, c2) -> Character.compare(c2, c1));

        String result = sortString(lowerCharList) + sortString(upperCharList);
        System.out.println(result);


    }
    public static String sortString(ArrayList<Character> arrayList){
        StringBuilder sb = new StringBuilder();
        for (Character c : arrayList) {
            sb.append(c);
        }
        return sb.toString();
    }

}
