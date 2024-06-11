import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int len;
    static int[][] table;
    static boolean[][] visited;
    static int x1, x2, y1, y2;
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            len = Integer.parseInt(br.readLine());

            table = new int[len][len];
            visited = new boolean[len][len];

            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            bfs();

            sb.append(table[x2][y2]).append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x1, y1});
        visited[x1][y1] = true;

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int nx = now[0];
            int ny = now[1];

            for (int i = 0; i < 8; i++) {
                int ox = nx + dx[i];
                int oy = ny + dy[i];

                if (ox >= 0 && oy >= 0 && ox < len && oy < len) {
                    if (!visited[ox][oy]) {
                        queue.add(new int[]{ox, oy});
                        table[ox][oy] = table[nx][ny] + 1;
                        visited[ox][oy] = true;
                    }
                }
            }
        }
    }
}
