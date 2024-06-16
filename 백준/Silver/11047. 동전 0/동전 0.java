import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int n, k;
    static int cnt = 0;
//    static int[] coins;
    static Stack<Integer> coins = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        // 입력 받은 n개의 동전을 스택에 넣어준다
        for (int i = 0; i < n; i++) {
            coins.add(Integer.parseInt(br.readLine()));
        }

        searchCoin(k);

        System.out.println(cnt);
    }


    public static void searchCoin(int k) {
        // K원이 0원이 되면 return
        if (k == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            // 제일 큰 값은 맨 위(뒤) 요소
            int descNum = coins.pop();

            // 큰 동전(값)이 k원 보다 작거나 같을 경우
            if (descNum <= k) {
                // k원을 동전으로 나눈 몫 == 동전의 개수
                cnt += k / descNum;
                
                // k원을 동전을 나눈 나머지 값으로
                k %= descNum;
                break;
            }
        }

        // 원하는 조건이 나올 때 까지 재귀
        searchCoin(k);
    }
}