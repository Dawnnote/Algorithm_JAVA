import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        while (N > 0) {
            if (N % 5 == 0) {
                count += N/5;
                break;
            } else {
                N -= 3;
                count += 1;
            }

            if (N < 0) {
                count = -1;
            }
        }


        System.out.println(count);
    }
}