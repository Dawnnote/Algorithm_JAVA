import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            // 문자가 ')' 인 경우
            if (str.charAt(i) == ')') {
                // 스택이 비어있지 않고, 스택의 맨 위 요소가 '(' 인 경우
                if (!stack.isEmpty() && stack.peek() == '(') {
                    // 해당 요소 제거
                    stack.pop();
                }
                // 그렇지 않으면 요소 추가
                else stack.push(str.charAt(i));
            }
            // 그렇지 않으면 요소 추가
            else stack.push(str.charAt(i));
        }
        // 스택 사이즈 == 결과
        System.out.println(stack.size());
    }
}