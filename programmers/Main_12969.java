import java.util.Scanner;

public class Main_12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        int count = 0;

        while (count < b){
            for (int i = 0; i < a; i++) {
                sb.append("*");
            }
            sb.append("\n");
            count ++;
        }
        System.out.println(sb);
    }
}
