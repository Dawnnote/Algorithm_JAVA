/**
 * 난이도: 브론즈
 * 분류: 구현 (2차원 배열)
 *
 * 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
 * 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
 * N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
 *
 */

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
        br.close();

        System.out.println(sb);
    }
}