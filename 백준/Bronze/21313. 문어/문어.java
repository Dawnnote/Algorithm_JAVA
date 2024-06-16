import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, oct;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
            문어들이 짝수 면 1, 2, 1, 2 ... 반복 적인 패턴이 나타남
            문어들이 홀수 면 1, 2.... 1, 2, 3 마지막 문어는 3번 손이 필요
         */

        n = Integer.parseInt(br.readLine());
        // 1, 2, 1, 2... 숫자가 반복적이므로 반으로 나눠 loop를 돌 생각
        oct = n/2;

        octopus();

        // 문어가 홀수 면 3을 추가해준다
        if (n % 2 == 1) {
            sb.append(3);
        }

        System.out.println(sb);
    }

    
    public static void octopus() {
        // 문어들이 손을 다 잡았다면 return
        if (cnt == oct) return;
        // 문어들이 손을 1, 2 반복 적으로 잡기 때문에 1~2 loop
        for (int i = 1; i <= 2; i++) {
            sb.append(i).append(" ");
        }
        // 손을 잡았다면 count + 1
        cnt++;
        // 문어들이 손을 다 잡을 동안 재귀
        octopus();
    }
}
