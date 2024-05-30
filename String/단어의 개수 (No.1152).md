```java
/**
 * 백준 1152번 : 단어의 개수
 * 난이도 : 브론즈
 * 분류 : 문자열
 *
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
 * 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.\
 *
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫번째 매개변수는 입력 받은 문자열
        // 두번째 매개변수는 구분자 (구분자 기준으로 문자열을 나눔)
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 전체 토큰 수를 반환 하는 countTokens() 메서드 사용
        System.out.println(st.countTokens());

        br.close();
    }
}
```