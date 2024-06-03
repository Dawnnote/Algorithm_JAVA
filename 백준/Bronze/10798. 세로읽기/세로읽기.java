import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 크기만큼 행렬 생성
        String[][] matrix = new String[5][15];

        // 입력받은 문자열 나눠서 2차원 배열에 담기
        for (int row = 0; row < 5; row++) {
            String[] ch = br.readLine().split("");
            int range = ch.length;

            for (int col = 0; col < range; col++) {
                matrix[row][col] = ch[col];
            }
        }
        br.close();
        
        StringBuilder sb = new StringBuilder();

        // 세로로 읽기 위해서 행부터 차례로 읽어와야 함
        for (int col = 0; col < 15; col ++) {
            for (int row = 0; row < 5; row++) {
                if (matrix[row][col] == null) continue;
                sb.append(matrix[row][col]);
            }
        }

        System.out.println(sb);
    }
}