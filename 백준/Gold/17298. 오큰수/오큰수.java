import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numList = new int[N];
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {

            while(!stack.isEmpty() && numList[stack.peek()] < numList[i]) {
                numList[stack.pop()] = numList[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            numList[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int result : numList) {
            sb.append(result).append(" ");
        }

        System.out.println(sb);
    }
}