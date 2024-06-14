import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /*
            영학이가 우유 마시는 규칙
            딸기우유(0) -> 초코우유(1) -> 바나나우유(2) -> 딸기우유(0)
            0 -> 1 -> 2 -> 0
            그리고 위 순서에 맞지 않으면 그냥 지나치게 되어 있다
        */
        int[] milk = {0, 1, 2};
        
        // 입력 받을 우유 가게 정보(우유 종류)
        int[] milkStore = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; st.hasMoreTokens(); i++) {
            milkStore[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(countMilk(milkStore, milk));
    }

    public static int countMilk(int[] milkStore, int[] milk) {
        // 마실 수 있는 우유 count
        int cnt = 0;
        // 우유 규칙의 순서를 도와줄 idx
        int idx = 0;

        for (int milkInfo : milkStore) {
            // 해당 우유 가게 정보와, 우유 규칙(0, 1, 2) 맞다면
            if (milkInfo == milk[idx]) {
                // 마실 수 있는 우유 +1
                cnt += 1;
                // 우유 규칙 idx +1
                idx += 1;

                // idx 값이 3이 된다는 건 -> 0, 1, 2 규칙 사이클 한번을 거쳐옴
                // 사이클을 다시 돌기 위해 0으로 초기화
                if (idx == 3) idx = 0;
            }
        }
        return cnt;
    }
}
