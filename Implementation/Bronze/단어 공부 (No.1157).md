```java
/**
 * ### 1157번: 단어 공부
 * 난이도: 브론즈
 * 분류: 구현
 *
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 *
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다
 *
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] chL = str.toUpperCase().split("");

        Map<String, Integer> ch = new HashMap<>();

        for (String c : chL) {
            ch.put(c, ch.getOrDefault(c, 0) + 1);
        }

        // value 값이 제일 큰 수를 구하고 변수에 저장
        int num = Collections.max(ch.values());

        // 결과 기본 값 "?" 초기화
        String result = "?";

        // 같은 값이 여러개 있을 경우를 생각해 핸들러를 만듬
        boolean handle = true;
        for (String key : ch.keySet()) {
        
		        // key의 value값이 구한 최댓값과 같고
		        // handle == true
            if (ch.get(key) == num && handle) {
                result = key;
                handle = false;
            }

            // 같은 value 값인 경우
            // handle == false
            else if (ch.get(key) == num && !handle){
                result = "?";
            }
        }

        System.out.println(result);
        br.close();
    }
}
```