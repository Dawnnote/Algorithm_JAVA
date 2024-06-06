import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> table = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            // 문자열을 거꾸로 만들어 주기 위해 StringBuffer 사용
            StringBuffer bf = new StringBuffer(word);
            String reverse = bf.reverse().toString();

            // 뒤집어도 같은 문자이거나, 입력 받은 문자가 null이 아닌 경우
            if (word.equals(reverse) || table.get(word) != null) {
                char ch = word.charAt(word.length()/2);
                sb.append(word.length()).append(" ").append(ch);
                break;
            }

            // 거꾸로 된 문자열을 넣어준다
            // 위 if 조건문에서 입력 받은 문자가 null 아니라면 같은 문자인 것
            table.put(reverse, 0);
        }
        System.out.println(sb);
    }
}
