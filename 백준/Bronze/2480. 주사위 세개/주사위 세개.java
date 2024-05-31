import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();

        if (numA == numB && numA == numC) {
            System.out.println(10000 + (numA * 1000));
        } else if ((numA == numB && numA != numC) || (numA == numC && numA != numB)) {
            System.out.println(1000 + (numA * 100));
        } else if ((numB == numC && numB != numA)) {
            System.out.println(1000 + (numB * 100));
        } else {
            int max = (numA > numB) && (numA > numC) ? numA : (numB > numC) ? numB : numC;
            System.out.println(max * 100);
        }

    }
}