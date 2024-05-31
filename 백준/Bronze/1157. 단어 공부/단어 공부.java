import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] chL = str.toUpperCase().split("");

        Map<String, Integer> ch = new HashMap<>();

        for (String c : chL) {
            ch.put(c, ch.getOrDefault(c, 0) + 1);
        }

        int num = Collections.max(ch.values());

        String result = "?";
        boolean handle = true;
        for (String key : ch.keySet()) {
            if (ch.get(key) == num && handle) {
                result = key;
                handle = false;
            } else if (ch.get(key) == num && !handle){
                result = "?";
            }
        }

        System.out.println(result);
        br.close();
    }
}