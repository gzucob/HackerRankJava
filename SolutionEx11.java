//Java Int to String
import java.util.Scanner;
public class SolutionEx11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String s = String.valueOf(n);
        if (s.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

        //TESTE - HackerRank, why accept this code?
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //String s = String.valueOf(n);
        //System.out.println("Good job");
    }
}
