package implement.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
public class Main_12939 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<Integer> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c) || (c == '-') && Character.isDigit(s.charAt(i + 1))) {
                sb.append(c);
            } else if (sb.length() > 0) {
                al.add(Integer.parseInt(sb.toString()));
                sb.setLength(0);
            }
        }

        if (sb.length() > 0) {
            al.add(Integer.parseInt(sb.toString()));
        }

        int max = Collections.max(al);
        int min = Collections.min(al);

        System.out.println(min + " " + max);
    }
}
 */

public class Main_12939 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] tmp = s.split(" ");
        int[] intArray = new int[tmp.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(tmp[i]);
        }

        Arrays.sort(intArray);
        String result = intArray[0] + " " + intArray[intArray.length - 1];
        System.out.println("result = " + result);

    }
}