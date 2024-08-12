import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            System.out.println(answer(br.readLine()));
        }
    }

    public static String answer(String testCase) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < testCase.length(); i++) {
            char parenthesis = testCase.charAt(i);

            if (parenthesis == '(') {
                stack.push(parenthesis);
            }
            else if (stack.empty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }

        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}