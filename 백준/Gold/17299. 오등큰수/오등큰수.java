import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Stack<Integer> stack = new Stack<>();
        int[] numList = new int[N];
        int[] count = new int[1000001];
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
            count[numList[i]]++;
        }

        for (int i = 0; i < N; i++) {

            while (!stack.isEmpty() && count[numList[stack.peek()]] < count[numList[i]]) {
                result[stack.pop()] = numList[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}