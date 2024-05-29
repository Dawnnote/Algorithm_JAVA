
```java
/**
 * 백준 2438번 : 별 찍기 -1
 * 난이도 : 브론즈
 * 분류 : 구현
 * 
 * - N번째 줄에 별 N개를 찍는 문제
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 첫번째 for문 행 출력
        for (int i = 0; i < num; i++) {
            
            // 두번째 for문 열 출력
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            
            // 줄 바꿈을 위한 코드
            System.out.println();
        }
    }
}
```
