package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            for (int x = a; x < b; x++) {
                if ((x % 5 == 0) && (x % 10 != 0) && (x != a)) {
                    System.out.print(x + " ");
                }
            }
        } else {
            System.out.print("Некорректный ввод");
        }
    }
}
