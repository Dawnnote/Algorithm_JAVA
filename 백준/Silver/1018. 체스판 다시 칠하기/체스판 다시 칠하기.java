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

        boolean[][] matrix = new boolean[n][m];

        // 행렬 만들기
        for (int row = 0; row < n; row++) {
            String str = br.readLine();
            for (int col = 0; col < m; col++) {
                matrix[row][col] = (str.charAt(col) == 'W');
            }
        }

        // 체스 이동거리 : N - 7
        int deRow = n - 7;
        int deCol = m - 7;

        // 최악의 조건 8*8
        int answer = 64;

        for (int i = 0; i < deRow; i++) {
            for (int j = 0; j < deCol; j++) {
                answer = Math.min(answer, solve(matrix, i, j));
            }
        }

        System.out.println(answer);
    }

    public static int solve(boolean[][] matrix, int x, int y) {
        // 체스판 크기 8*8
        int chessRow = x + 8;
        int chessCol = y + 8;

        // 체스판 이동 후 첫 컬럼의 상태 - true, false
        boolean check = matrix[x][y];

        // 다시 칠하는 수
        int count = 0;

        for (int row = x; row < chessRow; row++) {
            for (int col = y; col < chessCol; col++) {
                if (matrix[row][col] != check) {
                    count += 1;
                }

                check = !check;
            }
            check = !check;
        }

        // 기존 컬러에서 다른 컬러로 바꾸는 경우 = 최악의 조건에서 count를 뺀 것
        return Math.min(count, 64-count);
    }
}