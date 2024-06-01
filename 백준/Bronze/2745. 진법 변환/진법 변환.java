/**
 * 성능 :
 *
 * 백준 2745번: 진법 변환
 * 난이도: 브론즈
 * 분류: 구현, 문자열
 *
 * B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 *
 * 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
 * B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String ch = st.nextToken();
        int numB = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int result = 0;

        // 오른쪽 부터 계산 해야 함
        for (int i = ch.length()-1; i >= 0; i--) {
            char c = ch.charAt(i);

            if ('A' <= c && c <= 'Z') {
                // 'A' 아스키 코드 값은 65
                result += (c - 55) * tmp;
            } else {
                // 알파벳이 아닌 경우
                // 문자 0의 아스키 코드 값인 48을 빼고 tmp와 곱한다
                result += (c - 48) * tmp;
            }

            // 진법 만큼 곱해줘야함
            tmp *= numB;
        }

        System.out.println(result);
    }
}