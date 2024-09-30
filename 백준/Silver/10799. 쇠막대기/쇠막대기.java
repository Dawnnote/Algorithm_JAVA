import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sticks = br.readLine().split("");

        Stack<String> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < sticks.length; i++) {
            if (sticks[i].equals(")")) {
                
                if (sticks[i-1].equals(")")) {
                    stack.pop();
                    count += 1;
                    continue;
                }

                stack.pop();
                count += stack.size();
                continue;
            }
            stack.push(sticks[i]);
        }
        System.out.println(count);
    }
}