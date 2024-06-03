import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[][] matrix = new String[n][n];
        boolean check = false;

        int totalRow = 0;
        int totalCol = 0;

        for (int row = 0; row < n; row++) {
            String[] str = br.readLine().split("");
            for (int col = 0; col < n; col++) {
                matrix[row][col] = str[col];
            }
        }

        // 가로 길이
        for (int row = 0; row < n; row++) {
            int cnt = 0;

            for (int col = 0; col < n; col++) {

                if (matrix[row][col].equals(".")) {
                    cnt += 1;
                }

                if(matrix[row][col].equals("X")) {
                    cnt = 0;
                }

                if (2 == cnt) {
                    totalRow += 1;
                }
            }
        }

        // 세로 길이
        for (int col = 0; col < n; col++) {
            int cnt = 0;

            for (int row = 0; row < n; row++) {
                if (matrix[row][col].equals(".")) {
                    cnt += 1;
                }

                if(matrix[row][col].equals("X")) {
                    cnt = 0;
                }

                if (2 == cnt) {
                    totalCol += 1;
                }
            }
        }

        System.out.println(totalRow + " " + totalCol);
    }
}