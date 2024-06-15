import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // FIFO 자료구조인 queue로 문제 접근
        Queue<Integer> queue = new LinkedList<>();

        // 각각 입력 받은 번호를 String 배열에 넣어 주었다
        String[] number1 = br.readLine().split("");
        String[] number2 = br.readLine().split("");

        // 숫자를 번갈아가며 queue에 추가 해 주었다
        for (int i = 0; i < 8; i++) {
            queue.add(Integer.parseInt(number1[i]));
            queue.add(Integer.parseInt(number2[i]));
        }

        percent(queue);

        System.out.println(sb);
    }


    public static void percent(Queue<Integer> queue) {
        // poll()를 하기 때문에 재귀를 돌때 마다 size는 변할 것
        int size = queue.size();

        // 결과값 두자리를 출력하기 때문에 queue 사이즈 2가 되면 return
        if (size == 2) {
            sb.append(queue.poll()).append(queue.poll());
            return;
        }

        for (int i = 0; i < size-1; i++) {
            // 첫 번째로 제거 되는 요소 값 + 값이 제거 된 바로 다음 수의 요소 값
            // 10으로 나눈 나머지 == 일의 자리
            int num = (queue.poll() + queue.peek()) % 10;
            
            // 위 결과 값을 다시 넣어줌 (맨 뒤)
            queue.add(num);
        }
        // 마지막에 요소는 제거 (처음 배열의 값)
        queue.poll();

        // 조건에 맞을 때까지 재귀
        percent(queue);
    }
}
