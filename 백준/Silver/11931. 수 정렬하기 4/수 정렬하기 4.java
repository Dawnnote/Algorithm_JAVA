import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] numberList = new Integer[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            numberList[i] = num;
        }

        Arrays.sort(numberList, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (int n : numberList) {
            sb.append(n).append("\n");
        }

        System.out.print(sb);
    }
}