import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        HashMap<String, Integer> school = new HashMap<>();

        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int soju = Integer.parseInt(st.nextToken());

                school.put(name, soju);
            }

            // 최댓값
            int maxValue = Collections.max(school.values());

            // 최댓값을 가진 Key(학교 이름) 출력
            for (Map.Entry<String, Integer> entry : school.entrySet()) {
                if (entry.getValue() == maxValue) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }
}