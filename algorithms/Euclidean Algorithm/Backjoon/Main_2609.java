import java.util.Scanner;

public class Main_2609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int gcd = gcd(x, y);
        int lcm = (x * y) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
