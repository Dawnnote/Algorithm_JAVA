import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        
        // 숫자의 합을 받을 변수
        int num = 0;

        int range = word.length();
        for (int i = 0; i < range; i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                num += word.charAt(i) - 38; // A = 65
            } else {
                num += word.charAt(i) - 96; // a = 97
            }
        }
        
        // 2부터 구한 수까지 나눠서, 나눠 지면 소수가 아닌 정답을 리턴
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("It is not a prime word.");
                return;
            }
        }
        System.out.println("It is a prime word.");
    }
}