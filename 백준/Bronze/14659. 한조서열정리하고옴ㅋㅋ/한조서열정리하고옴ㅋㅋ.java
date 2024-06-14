import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 봉우리의 높이들
        int[] top = new int[n];

        // 입력 받은 봉우리 만큼 top 배열에 담음
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; st.hasMoreTokens(); i++) {
            top[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(archer(top));
    }

    public static int archer(int[] top) {
        // 최댓값 변수
        int max = 0;

        // 2중 for문을 이용해 가장 왼쪽 부터 차례대로 비교하며 진행
        // 가장 오른쪽은 비교할 대상이 없으므로 제외 (length -1)
        for (int i = 0; i < top.length - 1; i++) {
            // 다음 차례의 봉우리를 구할 때 마다 cnt 0으로 초기화
            int cnt = 0;
            for (int j = i + 1; j < top.length; j++) {
                // 현재 봉우리보다 높은 봉우리 만나면 그대로 break
                if (top[i] < top[j]) break;
                cnt += 1;
            }
            // 각 봉우리 탐색이 끝날 때마다 최댓값을 구해줌
            max = Math.max(max, cnt);
        }

        return max;
    }
}
