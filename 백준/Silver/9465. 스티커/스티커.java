import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int[][] sticker = new int[2][n];
            int[][] dp = new int[3][n + 1];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                sticker[0][i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                sticker[1][i] = Integer.parseInt(st.nextToken());
            }

            System.out.println(maxSticker(n, dp, sticker));
        }
    }

    public static int maxSticker(int n, int[][] dp, int[][] sticker) {
        dp[1][1] = sticker[0][0];
        dp[2][1] = sticker[1][0];

        for (int col = 2; col <= n; col++) {
            dp[0][col-1] = Math.max(dp[1][col-2], dp[2][col-2]);
            dp[1][col] = Math.max(dp[0][col-1], dp[2][col-1]) + sticker[0][col-1];
            dp[2][col] = Math.max(dp[0][col-1], dp[1][col-1]) + sticker[1][col-1];
        }

        return Math.max(dp[1][n], dp[2][n]);
    }
}