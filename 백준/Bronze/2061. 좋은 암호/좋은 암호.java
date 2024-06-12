import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger k = new BigInteger(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 2; i < l; i++) {
            // remainder 나머지를 구하고, compareTo 비교했을 때 같으면 0을 반환
            if (k.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO)==0) {
                result = i;
                break;
            }
        }

        // 구한 값(소수)가 0보다 크면(큰 수면 compareTo가 1로 반환) == BAD
        StringBuilder sb = new StringBuilder();
        if (result > 0) {
            sb.append("BAD ").append(result);
        } else {
            sb.append("GOOD");
        }

        System.out.println(sb);
    }
}
