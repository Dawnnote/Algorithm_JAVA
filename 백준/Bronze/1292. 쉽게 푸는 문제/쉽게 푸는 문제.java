import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> numList = new ArrayList<>();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = 0;

        for (int i = 1; i <= (b/2) + 1; i++) {
            for (int j = 0; j < i; j++){
                numList.add(i);
            }
        }

        for (int i = a-1; i < b; i++) {
            sum += numList.get(i);
        }

        System.out.println(sum);
    }
}