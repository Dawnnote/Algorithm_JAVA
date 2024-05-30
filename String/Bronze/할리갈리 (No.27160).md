```java
/**
 * 백준 27160번: 할리갈리
 * 난이도: 브론즈
 * 분류: 문자열, 해시 맵 (딕셔너리)
 *
 * 첫 번째 줄에 펼쳐진 카드의 개수 N이 주어집니다.
 * 두 번째 줄부터 N개의 줄에 걸쳐 한 줄에 하나씩 펼쳐진 카드의 정보가 주어집니다.
 * 카드의 정보는 공백으로 구분된, 과일의 종류를 나타내는 문자열 
 * S와 과일의 개수를 나타내는 양의 정수 X로 이루어져 있습니다.
 * S는 STRAWBERRY, BANANA, LIME, PLUM 중 하나입니다.
 * 
 * 한별이가 종을 쳐야 하면 YES을, 아니면 NO를 출력해주세요.
 *
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받은 문자를 int형 변환 시킴
        int range = Integer.parseInt(br.readLine());

        Map<String, Integer> halli = new HashMap<>();

        for (int i = 0; i < range; i++) {

            // 백준 입력 시 띄어쓰기(공백) 으로 입력 받게 되어 있다
            // BufferedReader는 Enter 기준으로 입력 받기 때문에 Tokenizer로 파싱하는 작업을 했다
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            String fruit = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            // 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환
            // 그렇지 않으면 설정한 default 값으로 반환
            halli.put(fruit, halli.getOrDefault(fruit, 0) + num);
        }

        // 결과 값을 "NO" 로 초기화
        String result = "NO";

        for (String key : halli.keySet()) {
            if (halli.get(key) == 5) {
                result = "YES";
                break;
            }
        }

        System.out.println(result);
        br.close();
    }
}
```