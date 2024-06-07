import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        PriorityQueue<Integer> ticket = new PriorityQueue<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            ticket.add(Integer.parseInt(st.nextToken()));
        }

        int minValue = ticket.peek() == null ? 0 : ticket.peek();

        if (minValue > 1) {
            System.out.println(1);
            return;
        }

        while(!ticket.isEmpty()) {
            minValue = ticket.poll() + 1;
            int nextValue = ticket.peek() == null ? 0 : ticket.peek();

            if(nextValue > minValue || nextValue == 0) {
                result = minValue;
                System.out.println(result);
                return;
            }
        }
    }
}