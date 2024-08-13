import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] words = br.readLine().split("");
        int N = Integer.parseInt(br.readLine());

        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();

        for (String word : words) {
            leftStack.push(word);
        }

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            if (command[0].equals("L")) {
                if (!leftStack.empty()) {
                    rightStack.push(leftStack.pop());
                }
            }
            else if (command[0].equals("D")) {
                if (!rightStack.empty()) {
                    leftStack.push(rightStack.pop());
                }
            }
            else if (command[0].equals("B")) {
                if (!leftStack.empty()) {
                    leftStack.pop();
                }
            } else if (command[0].equals("P")) {
                leftStack.push(command[1]);
            }
        }

        while(!leftStack.empty()) {
            rightStack.push(leftStack.pop());
        }

        while(!rightStack.empty()) {
            sb.append(rightStack.pop());
        }

        System.out.println(sb);
    }
}