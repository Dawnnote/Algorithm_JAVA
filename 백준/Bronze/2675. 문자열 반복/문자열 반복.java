import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();

        for (int i = 0; i < cycle; i++) {
            int range = sc.nextInt();
            String str = sc.next();
            String[] strL = str.split("");

            for (String s : strL) {
                for (int j = 0; j < range; j++) {
                    System.out.print(s);
                }
            }
            System.out.println();
        }
    }
}