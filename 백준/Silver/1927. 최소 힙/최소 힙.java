import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                // 배열이 없으면 0을 반환 그렇지 않으면, 최소값 반환
                int min = heap.peek() == null ? 0 : heap.poll();
                System.out.println(min);
            } else {
                heap.offer(x);
            }
        }
    }
}