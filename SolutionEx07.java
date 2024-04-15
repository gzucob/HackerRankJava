//Java Loops II
import java.util.Scanner;
public class SolutionEx07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        for (int i = 0; i < var; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                a = a + ((int) Math.pow(2, j)*b);
                System.out.print(a + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
