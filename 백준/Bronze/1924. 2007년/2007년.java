import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int num = 0;

        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 1) {
            int idx = day % week.length;
            System.out.println(week[idx]);
        } else {

            for (int i = 1; i < month; i++) {
                num += months[i - 1];
            }

            num += day;
            int idx = num % week.length;
            System.out.println(week[idx]);
        }
    }
}