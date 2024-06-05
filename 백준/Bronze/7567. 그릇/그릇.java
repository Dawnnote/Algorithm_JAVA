import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Queue<String> bowl = new LinkedList<>();
        
        int strRange = str.length();
        for (int i = 0; i < strRange; i++) {
            bowl.add(String.valueOf(str.charAt(i)));
        }

        // 처음 그릇을 빼서 변수로 설정
        String front = bowl.poll();
        // 처음 그릇의 높이 10cm 초기화
        int height = 10;
        
        while (!bowl.isEmpty()) {
            if (front.equals(bowl.peek())) {
                height += 5;
                front = bowl.poll();
            } else {
                height += 10;
                front = bowl.poll();
            }
        }

        System.out.println(height);
    }
}