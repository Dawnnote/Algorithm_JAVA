import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 우승자의 최종 점수를 담을 변수
        int totalScore = 0;

        for (int i = 0; i < n; i++) {
            int[] score = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            // 최종 점수를 구해주는 getTotal 함수를 만들었다
            int total = getTotal(score);

            // 최종 점수가 가장 높은 선수
            if (totalScore < total) {
                totalScore = total;
            }
        }
        br.close();

        System.out.println(totalScore);
    }


    public static int getTotal(int[] score) {
        int runScore = 0;
        int trickScore1 = 0;
        int trickScore2 = 0;

        // 런에서 받은 점수 중, 최고 점수
        for (int j = 0; j < 2; j++) {
            if (runScore < score[j]) {
                runScore = score[j];
            }
        }

        // 트릭에서 받은 상위 2개의 점수
        for (int k = 2; k < 7; k++) {
            // 첫번째로 높은 스코어 점수
            if (trickScore1 < score[k]) {
                trickScore2 = trickScore1;
                trickScore1 = score[k];
            }
            // 두번째로 높은 스코어 점수
            else if (trickScore2 < score[k]) {
                trickScore2 = score[k];
            }
        }

        return runScore + trickScore1 + trickScore2;
    }
}