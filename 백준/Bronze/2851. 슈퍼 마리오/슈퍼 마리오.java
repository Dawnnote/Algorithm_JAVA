import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = new int[10];

        for (int i = 0; i < 10; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }
        
        int result = searchScore(score);

        System.out.print(result);
    }

    // 100에 가까운 수와, 큰 값을 찾기 위한 함수
    public static int searchScore(int[] score) {
        // 100에 가까운 숫자 중 이전 값과 이후 값을 비교 하기 위한 변수
        int before = 0, after = 0;
        
        // after, before 각각 더해 주면서, 이후(after) 값이 100보다 크면 loop 빠져 나옴
        for (int num : score) {
            after += num;
            if (after > 100) {
                break;
            }
            before += num;
        }

        // 100에서 이전, 이후 값을 뺏을 때 가장 작은값 == 100 가까운 수
        if (100 - before < after - 100) {
            return before;
        }

        // 같거나, 이전 값(before)가 크면 이후 값(after) 반환
        return after;
    }
}
