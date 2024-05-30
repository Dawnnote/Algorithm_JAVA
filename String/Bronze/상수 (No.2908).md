```java
/**
 * 백준 2908번: 상수
 * 난이도: 브론즈
 * 분류: 문자열
 *
 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면,
 * 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 * 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
 *
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 스페이스로 입력받은 문자를 토큰화 한다
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // StringBuilder의 reverse 메소드를 쓰면 문자열을 뒤집을 수 있다
        // 뒤집은 문자열을 int형 변환 시켜준다
        int num1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        // Math 클래스의 max 메소드를 이용하여 가장 큰 값 추출
        System.out.println(Math.max(num1, num2));
    }
}
```