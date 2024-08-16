import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           String command = st.nextToken();

            if (command.equals("push_front")) {
                int num = Integer.parseInt(st.nextToken());
                deque.addFirst(num);
            }

            else if(command.equals("push_back")) {
                int num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
            }

            else if (command.equals("pop_front")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.poll());
                }
            }

            else if (command.equals("pop_back")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollLast());
                }
            }

            else if (command.equals("size")) {
                System.out.println(deque.size());
            }

            else if (command.equals("empty")) {
                if (deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

            else if (command.equals("front")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekFirst());
                }
            }

            else if (command.equals("back")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekLast());
                }
            }
        }
    }
}