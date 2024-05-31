import java.io.*;

public class Main {

    static int fibCnt, fibonacciCnt;
    static int[] f;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        f = new int[num+1]; // 배열 초기화


        fib(num);
        fibonacci(num);

        System.out.println(fibCnt + " " + fibonacciCnt);

        br.close();
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            fibCnt++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n -2));
        }
    }

    static int fibonacci(int n) {
        f[1] = f[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibonacciCnt++;
            f[i] = f[i -1] + f[i - 2];
        }
        return f[n];
    }
}