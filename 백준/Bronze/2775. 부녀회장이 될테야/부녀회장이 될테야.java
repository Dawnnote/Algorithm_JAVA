import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            // 각 호수의 사람 수를 담을 배열
            int[] building = new int[n];

            // 호수(n) 만큼 사람 수를 담아 준다
            for (int j = 0; j < n; j++) {
                building[j] = j + 1;
            }

            // 입력받은 층, 호수 만큼 for문을 돌려 k-1층의 n호까지의 합을 구해줌
            for (int floor = 0; floor < k; floor++) {
                for (int room = 1; room < n; room++) {
                    building[room] += building[room - 1];
                }
            }

            // 마지막 인덱스 값이 원하는 층의 값
            System.out.println(building[n -1]);
        }
    }
}