/**
 * 난이도: 브론즈
 * 분류: 구현 (2차원 배열)
 *
 * 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때,
 * 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
 * 예를 들어, 다음과 같이 81개의 수가 주어지면
 * 이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 컬럼이 10인 이유는
        // 이전 컬럼과 값을 비교하여 더 큰 값을 넣어주려고
        int[][] matrix = new int[9][10];

        // 결과값 출력할 변수
        int realRow = 0;
        int realCol = 0;

        // 큰 값을 위해 길잡이 역할
        boolean check = true;

        // 각 행의 제일 큰 값은 rowMax 변수
        // 그 중 제일 큰 값을 totalMax 변수
        int rowMax = 0;
        int totalMax = 0;

        for (int row = 0; row < 9; row++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int totalToken = st.countTokens();

            for (int col = 0; col < totalToken; col++) {
                int num = Integer.parseInt(st.nextToken());

                // 입력 받은 숫자가 이전 행렬의 값보다 크고,
                // 입력 받은 숫자가 한 행의 제일 큰 값보다 크고,
                // 입력 받은 숫자가 전체 행의 제일 큰 값보다 클 경우,
                if(matrix[row][col] <= num && rowMax <= num && totalMax <= num) {

                    // 바로 다음 컬럼에 값을 넣어줌
                    // 다음 비교 대상이 됨
                    matrix[row][col+1] = num;
                    check = false;
                }

                // 위 조건에 충족 되는 값일 때,
                // 행의 제일 큰 값을 rowMax 변수에 넣어주고
                // 큰 값의 행과 열을 각각 지정
                if (!check) {
                    rowMax = num;
                    realRow = row + 1;
                    realCol = col + 1;
                    check = true;
                }
            }

            // 첫번째 행이 끝나고 이전 행의 큰 값과 비교
            if (totalMax < rowMax) {
                totalMax = rowMax;
            }
        }
        br.close();

        System.out.println(totalMax);
        System.out.println(realRow+ " " + realCol);
    }
}