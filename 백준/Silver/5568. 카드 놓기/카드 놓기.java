import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    static int k, n;
    // 중복값을 제외하기 위한 HashSet
    static HashSet<String> set = new HashSet<String>();
    // 방문여부를 확인할 boolean
    static boolean[] check;
    // 카드에 적혀있는 수를 String 배열로 담아줌
    static String[] cards;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        check = new boolean[n];
        cards = new String[n];
        for (int i = 0; i < n; i++) {
            cards[i] = br.readLine();
        }

        backTracking(0, "");

        System.out.println(set.size());
    }

    
    public static void backTracking(int cnt, String num) {
        // k개 만큼 선택 되었다면
        if (cnt == k) {
            // set을 이용해서 중복 값 제외
            set.add(num);
            return;
        }
        for (int i = 0; i < n; i++) {
            // check로 방문여부 확인
            if(!check[i]) {
                // 방문 했으니 true
                check[i] = true;
                
                backTracking(cnt + 1, num + cards[i]);
                
                // 백트래킹에서 나오면 false로 전환
                check[i] = false;
            }
        }
    }
}