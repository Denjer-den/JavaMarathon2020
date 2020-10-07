package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            pw1.print(random.nextInt(100) + " ");
        }
        pw1.close();

        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        Scanner scanner = new Scanner(file1);
        String s = scanner.nextLine();
        String[] str = s.split(" ");
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
            if ((i + 1) % 20 == 0) {
                double aSum = (double) sum / (i + 1);
                pw2.print(aSum + " ");
            }
        }
        pw2.close();

        printResult(file2);
    }

    static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine();
        String[] str = s.split(" ");
        double sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += Double.parseDouble(str[i]);
        }
        System.out.println((int) sum);
    }
}
