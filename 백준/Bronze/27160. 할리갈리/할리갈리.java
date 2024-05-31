import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int range = Integer.parseInt(br.readLine());

        Map<String, Integer> halli = new HashMap<>();

        for (int i = 0; i < range; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            String fruit = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            halli.put(fruit, halli.getOrDefault(fruit, 0) + num);
        }

        String result = "NO";
        for (String key : halli.keySet()) {
            if (halli.get(key) == 5) {
                result = "YES";
            }
        }

        System.out.println(result);
        br.close();
    }
}