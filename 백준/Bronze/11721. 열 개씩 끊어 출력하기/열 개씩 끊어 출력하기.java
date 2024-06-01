/**
 * 성능 :
 *
 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며,
 * 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        // 몫으로 for문 루프 수를 정함
        int num  = word.length() / 10;

        // 나머지로 10글자 이하 단어를 구함
        int remainder  = word.length() % 10;

        // 문자열을 자를 범위, 변수
        int idx = 0;

        // 몫만큼 for문 루프를 돌아
        for(int i = 0; i < num; i ++) {
            //자를 범위를 지정해 준다. 10글자씩 이므로 +10을 해준다
            System.out.println(word.substring(idx, idx + 10));
            idx += 10;
        }

        // 나머지가 0보다 큰 경우
        if (remainder > 0) {
            // 전체길이에서 나머지를 뺀 만큼의 범위 부터 문자열을 자른다
            System.out.println(word.substring(word.length() - remainder));
        }
    }
}