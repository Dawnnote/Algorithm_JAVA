import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // 잡화점 잔돈
            int[] coins = {500, 100, 50, 10, 5, 1};
            // 지불할 돈
            int pay = Integer.parseInt(br.readLine());
            
            int result = greedy(coins, pay);
            
            System.out.println(result);
    }

    public static int greedy(int[] coins, int pay) {
        // 1000엔 - 지불할 돈 = 거스름돈
        int change = 1000 - pay;
        // 잔돈의 매수 count
        int cnt = 0;

        for (int i = 0; i < coins.length; i++) {
            // 거스름돈 0원이 되면 for문 빠져 나옴
            if (change == 0) break;

            // 잔돈의 매수는 거스름돈을 잔돈으로 나눴을 때 몫으로 구할 수 있음
            cnt += change / coins[i];

            // 현재 거스름돈은, 잔돈을 나누고 남은 나머지의 값
            change %= coins[i];
        }

        return cnt;
    }
}
