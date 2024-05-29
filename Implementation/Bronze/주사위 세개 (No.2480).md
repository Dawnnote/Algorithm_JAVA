```java
/**
 * 백준 2480번 : 주사위 세개
 * 난이도 : 브론즈
 * 분류 : 구현
 *
 * 
 *  1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 
 * 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
 * 
 * - 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000
 * - 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100
 * - 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100
 *
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();

            // 모두 같은 경우
        if (numA == numB && numA == numC) {
            System.out.println(10000 + (numA * 1000));
            
            // A와 B가 같거나 A와 C가 같은 경우
        } else if ((numA == numB && numA != numC) || (numA == numC && numA != numB)) {
            System.out.println(1000 + (numA * 100));
            
            // B와 C가 같은 경우
        } else if ((numB == numC && numB != numA)) {
            System.out.println(1000 + (numB * 100));
            
            // 모두 다른 경우
        } else {
            // 다른 경우에는 가장 큰 눈을 구해야 되는데
            // 조건문이 길어지기 때문에 보기 힘들어 삼항 연산자 이용 (Math 함수를 쓰면 더 간단하게 가능)
            int max = (numA > numB) && (numA > numC) ? numA : (numB > numC) ? numB : numC;
            System.out.println(max * 100);
        }
    }
}
```