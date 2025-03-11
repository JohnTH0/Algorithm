import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] sArr = br.readLine().split(" ");
        int count = 0;

        if (N <= 2) {
            System.out.println(count);
        } else {
            // 탐색할 배열 생성
            int[] intArr = new int[N];
            for (int i = 0; i < N; i++) {
                intArr[i] = Integer.parseInt(sArr[i]);
            }

            // 탐색할 배열 정렬
            Arrays.sort(intArr);

            // 반복문을 순회( 두 수의 합이므로 인덱스를 2부터 시작
            for (int k = 0; k < N; k++) {
                long target = intArr[k];
                int start = 0;
                int end = N - 1;

                while (start < end) {
                    if (intArr[start] + intArr[end] > target) { // 목표값보다 큰 경우 큰 포인터값 감소
                        end--;
                    } else if (intArr[start] + intArr[end] < target) { // 목표값보다 작은 경우 작은 포인터값 증가
                        start++;
                    } else {
                        // 설정한 포인터가 타겟과 다른지 확인
                        if((start != k) && (end != k)) {
                            count++;
                            break;
                        }
                        else if (start == k){
                            start++;
                        }else{
                            end--;
                        }

                    }
                }
            }
            System.out.println(count);
        }
    }
}
