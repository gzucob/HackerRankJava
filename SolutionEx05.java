//Java Output Formatting
import java.util.Scanner;
public class SolutionEx05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String varString = scanner.next();
            int varNumber = scanner.nextInt();
            System.out.printf("%-15s%03d\n", varString, varNumber);
        }
        System.out.println("================================");
    }
}