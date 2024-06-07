import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Integer[] height = new Integer[9];
        int sum = 0;

        for (int i = 0; i < 9; i ++) {
            int n = Integer.parseInt(br.readLine());
            height[i] = n;
            // 전체 합계를 구함
            sum += height[i];
        }

        // 오름차순 정렬
        Arrays.sort(height);

        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 9; j++) {

                // 7명의 키의 합은 100이므로 전체 합계에서 두명을 뺀 값이 100이 되어야 한다
                if (sum - (height[i]+height[j]) == 100) {
                    for (int k = 0; k < 9; k++) {

                        // 나머지 두명에 해당하는 값이 나오면 continue
                        if (i == k || j == k) {
                            continue;
                        }
                        // 위 조건을 제외 한 나머지 결과 값 append
                        sb.append(height[k]).append("\n");
                    }
                    // 결과 출력
                    System.out.println(sb);
                    return;
                }
            }
        }
    }
}