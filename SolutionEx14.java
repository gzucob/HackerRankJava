//Java Strings Introduction
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SolutionEx14 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));

        String myStringOne = String.valueOf(bufferedReader.readLine()).toLowerCase();
        String myStringTwo = String.valueOf(bufferedReader.readLine()).toLowerCase();

        int sum = myStringOne.length() + myStringTwo.length();
        System.out.println(sum);

        int lexicographically = myStringOne.compareTo(myStringTwo);
        if (lexicographically < 0) {
            System.out.println("No");
        } else if (lexicographically > 0) {
            System.out.println("Yes");
        } else if (lexicographically == 0) {
            System.out.println("No"); //Acredito que o output correto seria "Equal", porem no teste tinha que ser "No"
        }

        String capitalizeOne = Character.toUpperCase(myStringOne.charAt(0)) + myStringOne.substring(1).toLowerCase();
        String capitalizeTwo = Character.toUpperCase(myStringTwo.charAt(0)) + myStringTwo.substring(1).toLowerCase();

        System.out.println(capitalizeOne + " " + capitalizeTwo);
    }
}
