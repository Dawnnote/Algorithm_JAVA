import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /*
            1-3-5-2-4-1 으로 별을 만들 수 있다. 중복된 숫자 하나를 제외하고
            별은 숫자 5개 선택해서 만들 수 있다
         */
        int k = 5;

        // 정수 범위가 넘어가서 BigIntege 사용
        BigInteger result = solve(n, k);

        System.out.println(result);
    }


    static BigInteger Factorial(int n)
    {
        // n이 0보다 작거나 같을 경우 1 return
        if (n <= 0)
        {
            return BigInteger.ONE;
        }
        // n(n-1)! -> 팩토리얼 공식
        return Factorial(n - 1).multiply(BigInteger.valueOf(n));
    }

    static BigInteger solve(int n, int k)
    {
        // k가 n보다 큰 경우 0을 return
        if (k > n)
        {
            return BigInteger.ZERO;
        }
        // [n! / (n-k)! * k!] => 이항 계수 공식
        return Factorial(n).divide(Factorial(k).multiply(Factorial(n - k)));
    }
}
