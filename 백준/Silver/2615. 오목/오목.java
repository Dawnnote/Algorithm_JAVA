import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] area = new int[21][21];
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i <= 19; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 19; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int row = 1; row <= 19; row++) {
            for (int col = 1; col <= 19; col++) {
                if (area[row][col] != 0) {
                    if (area[row][col - 1] != area[row][col] && horizontal(area[row][col], row, col, count) == 5) {
                        System.out.print(area[row][col] + "\n" + row + " " + col);
                        return;
                    }
                    if (area[row - 1][col] != area[row][col] && vertical(area[row][col], row, col, count) == 5) {
                        System.out.print(area[row][col] + "\n" + row + " " + col);
                        return;
                    }
                    if (area[row - 1][col - 1] != area[row][col] && diagonalD(area[row][col], row, col, count) == 5) {
                        System.out.print(area[row][col] + "\n" + row + " " + col);
                        return;
                    }
                    if (area[row + 1][col - 1] != area[row][col] && diagonalU(area[row][col], row, col, count) == 5) {
                        System.out.print(area[row][col] + "\n" + row + " " + col);
                        return;
                    }
                }
            }
        }
        System.out.println("0");
    }


    public static int horizontal(int color, int row, int col, int cnt) {
        for (; color == area[row][col + 1]; col++) cnt++;
        return cnt == 5 ? 5 : 0;
    }

    public static int vertical(int color, int row, int col, int cnt) {
        for (; color == area[row + 1][col]; row++) cnt++;
        return cnt == 5 ? 5 : 0;
    }

    public static int diagonalD(int color, int row, int col, int cnt) {
        for (; color == area[row + 1][col + 1]; row++, col++) cnt++;
        return cnt == 5 ? 5 : 0;
    }

    public static int diagonalU(int color, int row, int col, int cnt) {
        for (; color == area[row - 1][col + 1]; row--, col++) cnt++;
        return cnt == 5 ? 5 : 0;
    }
}