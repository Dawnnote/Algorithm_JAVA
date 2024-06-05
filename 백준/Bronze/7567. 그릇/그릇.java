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
        
        int height = 0;
        while (!bowl.isEmpty()) {
            String front = bowl.poll();

            if (front.equals(bowl.peek())) {
                height += 5;
            } else {
                height += 10;
            }
        }

        System.out.println(height);
    }
}