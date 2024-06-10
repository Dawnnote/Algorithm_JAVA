import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
    // 관계가 전혀 없을 경우 -1 초기값
    static int result = -1;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 해당 정점 방문 여부 확인
        visited = new boolean[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // map 초기화
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<Integer>());
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 양방향 설정
            graph.get(p).add(c);
            graph.get(c).add(p);
        }
        br.close();

        dfs(x, y, 0);

        System.out.println(result);
    }


    private static void dfs(int start, int end, int cnt) {
        // 서로 다른 두 사람의 번호가 같아질 때 count 결과 반환
        if (start == end){
            result = cnt;
            return;
        }

        // true = 방문함, false = 방문하지 않음
        visited[start] = true;
        for (int i = 0; i < graph.get(start).size(); i++) {
            int next = graph.get(start).get(i);
            if (!visited[next]) {
                dfs(next, end, cnt + 1);
            }
        }
    }
}
