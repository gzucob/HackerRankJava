//Java Date and Time
package HackerRankSolutionEx12;

import java.io.*;
public class SolutionEx12 {
    public static void main(String[] args) throws IOException {
        //METODO USADO PRA PASSAR NO TESTE DO KACKER RANK!!!
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//        int day = Integer.parseInt(firstMultipleInput[1]);
//        int year = Integer.parseInt(firstMultipleInput[2]);
//        String res = ResultEx12.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        //FUNCIONA PASSANDO O PARAMETRO VIA CONSOLE EXEMPLO: 08 11 2000
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = ResultEx12.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
