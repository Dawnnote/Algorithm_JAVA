import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] number = new int[5];

        for(int i = 0; i < 5; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        // 배수 초기값 1
        int n = 1;
        while(true) {
            // 3개로 나눠지지 않으면 0으로 초기화
            int cnt = 0;


            for (int i = 0; i < 5; i++) {
                // n 을 나눈 나머지가 0 == 배수 (cnt +1)
                if(n % number[i] == 0) {
                    cnt++;
                }
            }

            // 세 개 이상 나누어지면 break;
            if (cnt >= 3) {
                break;
            }

            n++;
        }

        // 3개로 나누어진 대부분의 배수 출력
        System.out.println(n);
    }
}
