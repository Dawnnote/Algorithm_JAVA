import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int num, len;
    static int[] numL;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        num = Integer.parseInt(st.nextToken());
        len = Integer.parseInt(st.nextToken());

        numL = new int[len];

        dfs(0, 0);
        System.out.println(sb);
    }

    static void dfs(int depth, int start) {
        if (depth == len) {
            for (int value : numL) {
                sb.append(value).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < num; i++) {
            numL[depth] = i + 1;
            dfs(depth + 1, i + 1);
        }
    }
}