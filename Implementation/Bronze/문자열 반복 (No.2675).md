```java
/**
 * 백준 2675번 : 문자열 반복
 * 난이도 : 브론즈
 * 분류 : 구현
 *
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해
 * 새 문자열 P를 만든 후 출력하는 프로그램
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();

        // 총 사이클 (테스트 케이스 개수)
        for (int i = 0; i < cycle; i++) {

            int range = sc.nextInt();
            String str = sc.next();

            // 입력 받은 문자를 split 함수로 문자열을 잘라 배열에 담았다
            String[] strL = str.split("");

            // 배열에 담은 문자를 하나씩 꺼낸다
            for (String s : strL) {

                // 반복 횟수(range) 만큼 해당 문자를 반복한다
                for (int j = 0; j < range; j++) {
                    System.out.print(s);
                }
            }

            // 줄 바꿈을 위한 코드
            System.out.println();
        }
    }
}
```