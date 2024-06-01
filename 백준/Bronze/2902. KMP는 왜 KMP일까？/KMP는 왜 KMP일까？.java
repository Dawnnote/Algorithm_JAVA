/**
 * 성능 :
 *
 * 백준 2902번: KMP는 왜 KMP일까?
 * 난이도: 브론즈
 * 분류: 문자열
 *
 * 사람들은 이렇게 사람 성이 들어간 알고리즘을 두 가지 형태로 부른다.
 * - 첫 번째는 성을 모두 쓰고, 이를 하이픈(-)으로 이어 붙인 것이다. 예를 들면, Knuth-Morris-Pratt이다. 이것을 긴 형태라고 부른다.
 * - 두 번째로 짧은 형태는 만든 사람의 성의 첫 글자만 따서 부르는 것이다. 예를 들면, KMP이다.
 *
 * 동혁이는 매일매일 자신이 한 일을 모두 메모장에 적어놓는다. 잠을 자기 전에, 오늘 하루 무엇을 했는지 되새겨 보는 것으로 하루를 마감한다.
 * 하루는 이 메모를 보던 중, 지금까지 긴 형태와 짧은 형태를 섞어서 적어 놓은 것을 발견했다.
 * 이렇게 긴 형태로 하루 일을 기록하다가는 메모장 가격이 부담되어 파산될 것이 뻔하기 때문에, 앞으로는 짧은 형태로 기록하려고 한다.
 * 긴 형태의 알고리즘 이름이 주어졌을 때, 이를 짧은 형태로 바꾸어 출력하는 프로그램을 작성하시오.
 *
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens()) {
            String name = st.nextToken();
            
            // 문제에서 앞 글자와 '-' 뒤에는 무조건 대문자
            // 그 외에는 소문자이기 때문에 charAt 으로 앞글자 만 가져왔다
            sb.append(name.charAt(0));
        }

        System.out.println(sb);
    }
}