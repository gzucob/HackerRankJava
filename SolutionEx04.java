//Java Stdin and Stdout II
import java.util.Scanner;
public class SolutionEx04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int varInt = scanner.nextInt();
        double varDouble = scanner.nextDouble();
        scanner.nextLine();
        String varString = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + varString);
        System.out.println("Double: " + varDouble);
        System.out.println("Int: " + varInt);
    }
}
