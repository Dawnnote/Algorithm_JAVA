import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, k;
    static int[] walk = {-1, 1, 2};
    static int[] time = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        br.close();

        int cnt = bfs(n);

        System.out.println(cnt);
    }

    private static int bfs(int n) {
        Queue<Integer> step = new LinkedList<>();

        step.add(n);
        time[n] = 1;
        while (!step.isEmpty()) {
            int number = step.poll();

            if (number == k) {
                return time[number] - 1;
            }

            for (int i = 0; i < 3; i++) {
                int idx = i < 2 ? number + walk[i] : number * walk[i];
                if (idx >= 0 && idx <= 100000 && time[idx] == 0) {
                    step.offer(idx);
                    time[idx] = time[number] + 1;
                }
            }
        }
        return 0;
    }
}
