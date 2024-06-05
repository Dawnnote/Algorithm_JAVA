import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        // 입력 조건은 2이상, 무조건 한개는 볼 수 있어 초기값 1로 설정
        int count = 1;

        // 스택 생성
        for (int i = 0; i < n; i ++) {
            int num = Integer.parseInt(br.readLine());
            stack.push(num);
        }
        
        int front = stack.pop();
        while(!stack.isEmpty()) {
            // 앞에 숫자(front)가 stack에서 꺼낸 숫자보다 클 경우 +1
            if (stack.peek() > front) {
                count += 1;
                front = stack.peek();
            }
            stack.pop();
        }

        System.out.println(count);
    }
}