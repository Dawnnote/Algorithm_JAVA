import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // StringTokenizer 마지막 파라미터 값은 구분자를 포함할 지 여부이다
            StringTokenizer word = new StringTokenizer(br.readLine(), " ", true);

            sb.append("Case #").append(i+1).append(": ");

            while (word.hasMoreTokens()) {
                stack.push(word.nextToken());
            }

            while (!stack.isEmpty()) {
                String str = stack.pop();
                sb.append(str);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}