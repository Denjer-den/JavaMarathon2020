package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers");

        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");

        int sum = 0;
        double aSum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
            if (i == arr.length - 1)
                aSum = (double) sum / (i + 1);
        }
        System.out.printf(Locale.US, "%.15f", aSum);
        System.out.print(" --> ");
        System.out.printf("%.3f", aSum);
    }
}
