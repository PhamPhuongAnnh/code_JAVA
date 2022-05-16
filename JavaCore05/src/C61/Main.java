package C61;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try {
            PrintStream originalOut = System.out;
            // Create a new file output stream.
            PrintStream fileOut = new PrintStream("./nguyenMinhDuc1.txt");
            // Redirect standard out to file.
            System.setOut(fileOut);
            // Wrapped Scanner to get user input.
            Scanner sc = new Scanner(System.in);
            // change the locale of the scanner
            sc.useLocale(Locale.ENGLISH);
        int tc = sc.nextInt();
        int size, k;
        String str1, str2;

        for (int t = 1; t <= tc; t++) {
            size = sc.nextInt();
            double arr[] = new double[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextDouble();
            }

            sc.nextLine();
            str1 = sc.nextLine();
            str2 = sc.nextLine();

            k = sc.nextInt();

            System.out.printf("Case #%d:\n", t);
            System.out.printf("Sum: %f", Practice.getsum(arr));
            System.out.println("");
            System.out.printf("Min: %f", Practice.getMin(arr));
            System.out.println("");
            System.out.printf("Max: %f", Practice.getMax(arr));
            System.out.println("");
            System.out.println("To upper: " + Practice.toUpper(str1));
            System.out.println("To lower: " + Practice.toLower(str2));
            System.out.println("To upper first char: " + Practice.toUpperFirstChar(str1) + " - " + Practice.toUpperFirstChar(str2));
            System.out.println("Fibonacci(" + k + "): " + Practice.getFibonacci(k));
            
            originalOut.printf("Case #%d:\n", t);
            originalOut.printf("Sum: %f", Practice.getsum(arr));
            originalOut.println("");
            originalOut.printf("Min: %f", Practice.getMin(arr));
            originalOut.println("");
            originalOut.printf("Max: %f", Practice.getMax(arr));
            originalOut.println("");
            originalOut.println("To upper: " + Practice.toUpper(str1));
            originalOut.println("To lower: " + Practice.toLower(str2));
            originalOut.println("To upper first char: " + Practice.toUpperFirstChar(str1) + " - " + Practice.toUpperFirstChar(str2));
            originalOut.println("Fibonacci(" + k + "): " + Practice.getFibonacci(k));
        }
          System.setOut(originalOut);
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}