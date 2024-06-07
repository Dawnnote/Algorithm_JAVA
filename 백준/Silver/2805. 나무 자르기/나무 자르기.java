import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] tree = new int[n];

        int min = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());

            // 나무 길이중 최댓값을 구함
            if(max < tree[i]) {
                max = tree[i];
            }
        }

        while(min < max) {

            int mid = (min + max) / 2;
            long sum = 0;
            for (int height : tree) {

                if(height - mid > 0) {
                    sum += (height - mid);
                }
            }

            if (sum < m) {
                max = mid;
            }

            // 나무 길이의 합이 m(가져가는 길이) 보다 같거나 큰 경우
            // while문 조건에 맞
            else {
                min = mid+1;
            }
        }
        System.out.println(min-1);
    }
}