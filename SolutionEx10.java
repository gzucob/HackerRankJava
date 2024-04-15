//Java Static Initializer Block
import java.util.Scanner;
public class SolutionEx10 {
    static boolean validation = false;
    static int b, h;

    static {
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        h = scanner.nextInt();
        if (b > 0 && h > 0) {
            validation = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (validation) {
            int area = b * h;
            System.out.println(area);
        }
    }
}
