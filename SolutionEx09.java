//Java End-of-file
import java.util.Scanner;
public class SolutionEx09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        while (scanner.hasNext()) {
            System.out.println(n + " " + scanner.nextLine());
            n++;
        } scanner.close();
    }
}
