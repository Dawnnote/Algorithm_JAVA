import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] light = br.readLine().split(" ");
        int p = Integer.parseInt(br.readLine());

        for (int i = 0; i < p; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int option = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            changeSwitch(light, n, option, num);
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            sb.append(light[j]).append(" ");

            if ((j+1) % 20 == 0) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }


    public static void changeSwitch(String[] light, int range, int option, int num) {

        if (option == 1) {
            for (int i = 0; i < range; i++) {
                if ((i+1) % num == 0) light[i] = light[i].equals("0") ? "1" : "0";
            }
        } else {
            light[num-1] = light[num-1].equals("0") ? "1" : "0";
            int scope = range/2;
            for (int j = 1; j < scope; j++) {
                if ((num-1) + j >= range || (num-1) - j < 0) break;

                if (light[(num-1)-j].equals(light[(num-1)+j])) {
                    light[(num-1)-j] = light[(num-1)-j].equals("0") ? "1" : "0";
                    light[(num-1)+j] = light[(num-1)+j].equals("0") ? "1" : "0";
                } else break;
            }
        }
    }
}