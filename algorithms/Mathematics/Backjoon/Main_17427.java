import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 타임 아웃 */
//public class main_17427 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int result = 0;
////        1부터 주어진 값 N 까지 loop
//        for (int i =  1; i <= N; i++) {
////            loop 값 i에 대한 모든 약수를 확인 후 추가
//            for (int j = 1; j * j <= i; j++) {
//                if (i % j == 0){
//                    result += j;
////                    완전제곱수인 경우
//                    if (j != i / j){
//                        result += (i / j);
//                    }
//                }
//            }
//        }
//        System.out.println(result);
//    }
//}

public class Main_17427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result = 0;
        for (int i = 1; i <= N; i++) {
            result += (long)(N / i) * i;
        }
        System.out.println(result);
    }
}