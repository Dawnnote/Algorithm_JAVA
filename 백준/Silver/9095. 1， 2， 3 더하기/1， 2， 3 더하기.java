import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            // n은 11보다 작고, 인덱스 1부터 사용 하기 위해 배열 크기 11로 설정
            int[] dp = new int[11];

            dp[1] = 1; // n = 1 일 때, [1] -> dp[1] = 1
            dp[2] = 2; // n = 2 일 때, [1 + 1, 2] -> dp[2] = 2
            dp[3] = 4; // n = 3 일 때, [1 + 1 + 1, 2 + 1, 1 + 2, 3] -> dp[3] = 4

            // dp[4] = dp[3] + dp[2] + dp[1]
            // dp[n] = dp[n - 1] + dp[n - 2] + dp[n - 3]
            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            // n값에 해당하는 인덱스가 결과 값
            System.out.println(dp[n]);
        }
    }
}