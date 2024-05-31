import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(br.readLine());

        System.out.println((num * (num - 1))/2);
        System.out.println(2);

        br.close();
    }
}