import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static boolean check;
    public static int sequence = 1;
    public static StringBuilder sb = new StringBuilder();
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            solved(Integer.parseInt(br.readLine()));
        }

        if (check) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }

    public static void solved(int number) {
        for (; sequence <= number; sequence++) {
            stack.push(sequence);
            sb.append("+").append("\n");
        }

        if (stack.peek() == number) {
            stack.pop();
            sb.append("-").append("\n");
        } else {
            check = true;
        }
    }
}