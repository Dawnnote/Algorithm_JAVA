import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int totalScore = 0;

        for (int i = 0; i < n; i++) {
            int[] score = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int runScore = 0;
            int trickScore1 = 0;
            int trickScore2 = 0;
            int idx = 2;

            for (int j = 0; j < 2; j++) {
                if (runScore < score[j]) {
                    runScore = score[j];
                }
            }

            for (int k = 2; k < 7; k++) {
                if (score[k] <= score[idx] && trickScore2 < score[k]) {
                    trickScore2 = score[k];
                }

                if (trickScore1 < score[k]) {
                    trickScore2 = trickScore1;
                    trickScore1 = score[k];
                    idx = k;
                }
            }

            int sum = runScore + trickScore1 + trickScore2;

            if (totalScore < sum) {
                totalScore = sum;
            }
        }
        br.close();

        System.out.println(totalScore);
    }
}