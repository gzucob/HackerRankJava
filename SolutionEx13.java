//Java Currency Formatter
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
public class SolutionEx13 {
    public static void main(String[] args) throws IOException {

        //Por algum motivo o sistema abaixo não estava passando no teste usando Java 15
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double payment = Double.parseDouble(bufferedReader.readLine());

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String usFormattedPayment = usFormat.format(payment);
        System.out.println("US: " + usFormattedPayment);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String indiaFormattedPayment = indiaFormat.format(payment);
        //.replace(indiaFormat.getCurrency().getSymbol(), "");
        //No output o simbolo da moeda indiana deveria ser substituido por Rs.
        System.out.println("India: " + indiaFormattedPayment);

        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chinaFormattedPayment = chinaFormat.format(payment);
        System.out.println("China: " + chinaFormattedPayment);


        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String franceFormattedPayment = franceFormat.format(payment);
        System.out.println("France: " + franceFormattedPayment);

          //E porque esse passou?
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//        //Unica parte feita por mim, o restante já estava pronto quando troquei do Java 15 para o 8
//        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//        String india = NumberFormat.getCurrencyInstance(new Locale("EN", "IN")).format(payment);
//        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
//        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
//
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);'
    }
}
