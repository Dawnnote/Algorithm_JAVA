import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // 점수가 최소인 수열 count
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        /*
        점수가 최소인 수열을 구하려면 두 개의 i 사이에 합이 적어야 한다
        즉, 4가 주어진다면 11223344 11224433 ...... 이렇게 나와야 최소 점수가 나온다
        수열의 개수만 출력하면 되므로 배열에 다음과 같이 "[1,2,3,4]" 중복 되는 숫자는 넣지 않아도 된다
         */
        for (int i = 0; i < n; i++) {
            num[i] = i + 1;
        }

        backTracking(num, new ArrayList<>());

        System.out.println(cnt);

    }

    // 백트레킹을 이용한 순열
    public static void backTracking(int[] num, List<Integer> sample) {
        // sample 길이와 num 배열의 길이가 같으면 +1
        if (sample.size() == num.length) {
            cnt += 1;
        } else {
            for (int j : num) {
                // sample에 이미 해당 정수가 있다면 continue
                if (sample.contains(j)) continue;
                sample.add(j);
                backTracking(num, sample);
                // 백트레킹에서 나오면 ([sample 사이즈] - 1) 해당하는 인덱스 안에 요소를 제거한다
                sample.remove(sample.size() - 1);
            }
        }
    }
}
