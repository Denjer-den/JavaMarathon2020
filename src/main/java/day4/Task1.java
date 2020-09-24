package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random rand = new Random();
        int count8 = 0;
        int count1 = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(11);
            if (array[i] > 8) {
                count8++;
            }
            if (array[i] == 1) {
                count1++;
            }
            if (array[i] % 2 == 0 && array[i] != 0) {
                even++;
            }
            if (array[i] % 2 != 0 && array[i] != 0) {
                odd++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + count8);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + Arrays.stream(array).sum());
    }
}
