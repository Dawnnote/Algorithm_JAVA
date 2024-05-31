import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int col = 1;

        for(int i = 1; i <= num; i++) {

            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            col += 2;
            System.out.println();
        }
    }
}