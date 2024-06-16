import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int n, k;
    static int cnt = 0;
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
            int bigNum = coins.pop();
            if (bigNum <= k) {
                cnt += k / bigNum;
                k %= bigNum;
                break;
            }
        }

        // 원하는 조건이 나올 때 까지 재귀
        searchCoin(k);
    }
}
