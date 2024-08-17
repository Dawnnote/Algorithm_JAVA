import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean check = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '<') {
                check = true;
                while(!stack.empty()) {
                    sb.append(stack.pop());
                }
                sb.append(word.charAt(i));
            }

            else if(word.charAt(i) == '>') {
                check = false;
                sb.append(word.charAt(i));
            }
            
            else if(check) {
                sb.append(word.charAt(i));
            }

            else if (!check) {
                if(word.charAt(i) == ' ') {
                    while(!stack.empty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(word.charAt(i));
                }

                else {
                    stack.push(word.charAt(i));
                }
            }
        }

        while(!stack.empty()) {
            sb.append(stack.pop());
        }
        
        System.out.println(sb);
    }
}