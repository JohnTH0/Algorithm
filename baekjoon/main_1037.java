import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class main_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        처음 수를 사용하지 않고 넘김
        br.readLine();
        String divNString = br.readLine();
        String[] divNList = divNString.split(" ");
        int[] divNIntList = new int[divNList.length];

        for (int i = 0; i < divNList.length; i++) {
            divNIntList[i] = Integer.parseInt(divNList[i]);
        }

        Arrays.sort(divNIntList);

        int min = divNIntList[0];
        int max = divNIntList[divNIntList.length - 1];
        System.out.println(min * max);
    }
}

/* 다른 풀이
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		while(T-- > 0) {
			int N = Integer.parseInt(st.nextToken());
			max = N > max ? N : max;
			min = N < min ? N : min;
		}
		System.out.println(max * min);
	}

}
 */