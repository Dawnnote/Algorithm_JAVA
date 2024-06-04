import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> wordChain = new HashSet<>();
        int idx = -1;
        String[] strLis = new String[n];

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (!"?".equals(word)) wordChain.add(word);
            else idx = i;
            strLis[i] = word;
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String word = br.readLine();
            if (n == 1) {
                System.out.println(word);
                break;
            };
            if (wordChain.contains(word)) continue;

            if (idx == 0) {
                if (strLis[idx + 1].charAt(0) == word.charAt(word.length() - 1)) {
                    System.out.println(word);
                    break;
                }
            } else if (idx == n - 1) {
                if (strLis[idx -1].charAt(strLis[idx - 1].length() - 1) == word.charAt(0)) {
                    System.out.println(word);
                    break;
                }
            } else {
                if (strLis[idx + 1].charAt(0) == word.charAt(word.length() - 1)
                    && strLis[idx - 1].charAt(strLis[idx -1].length() - 1) == word.charAt(0)) {
                    System.out.println(word);
                    break;
                }
            }
        }
    }
}