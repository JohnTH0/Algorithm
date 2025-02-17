import java.util.Arrays;
import java.util.Scanner;

public class Main_2570 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] intArr = new int[N];
        for (int i = 0; i < N; i++) {
            intArr[i] = sc.nextInt();
        }
        Arrays.sort(intArr);
        for (int i = 0; i < N; i++) {
            System.out.println(intArr[i]);
        }
    }
}
