import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nm = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(nm.nextToken());
        int m = Integer.parseInt(nm.nextToken());

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] words = br.readLine().split(" ");
            int strLen = Integer.parseInt(words[0]);
            String title = words[1];

            String pitch = words[2] + " " + words[3] + " " + words[4];

            map.put(title, pitch);
        }
        
        for (int i = 0; i < m; i++) {
            String compare = br.readLine();
            String song = null;
            int count = 0;

            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().equals(compare)) {
                    song = entry.getKey();
                    count += 1;
                }
            }

            if (count == 1) {
                System.out.println(song);
            } else if (count > 1) {
                System.out.println("?");
            } else {
                System.out.println("!");
            }
        }

    }
}