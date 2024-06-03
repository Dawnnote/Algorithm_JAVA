import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 행렬의 크기 입력
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[n][m];

        StringBuilder sb = new StringBuilder();

        // 행렬 생성
        for (int row = 0; row < n; row++) {
            StringTokenizer stA = new StringTokenizer(br.readLine());
            int totalToken = stA.countTokens();

            for (int col = 0; col < totalToken; col++) {
                int num = Integer.parseInt(stA.nextToken());
                matrix[row][col] = num;
            }
        }

        // 행렬을 추가 할 필요 없이 바로 더 해주었다
        for (int row = 0; row < n; row++) {
            StringTokenizer stB = new StringTokenizer(br.readLine());
            int totalToken = stB.countTokens();

            for (int col = 0; col < totalToken; col++) {
                int num = Integer.parseInt(stB.nextToken());
                int result = matrix[row][col] += num;

                sb.append(result).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}