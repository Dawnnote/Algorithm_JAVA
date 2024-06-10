import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
    static int[] visited;
    // 시작 정점도 순서에 포함이므로 값 1로 초기화
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<Integer>());
        }

        // 방문 순서를 담아줄 리스트 초기화
        visited = new int[n + 1];

        // 입력받은 간선의 수 만큼, 간선 정보 값을 넣어줌
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
        }
        br.close();

        // value 값들을 정렬
        for (ArrayList<Integer> value : graph.values()) {
            Collections.sort(value);
        }

        dfs(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append("\n");
        }

        System.out.println(sb);
    }


    private static void dfs(int start) {

        visited[start] = cnt;

        for (int i = 0; i < graph.get(start).size(); i++) {
            int node = graph.get(start).get(i);
            if (visited[node] == 0){
                cnt++;
                dfs(node);
            }
        }
    }
}
