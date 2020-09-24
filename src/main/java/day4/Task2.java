package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] = rand.nextInt(10001);
        }
        int most = array[0];
        int less = array[0];
        int count = 0;
        int sum = 0;
        for (Integer a : array) {
            if (most <= a) {
                most = a;
            }
            if (less >= a) {
                less = a;
            }
            if (a % 10 == 0) {
                sum += a;
                count++;
            }
        }
        System.out.println("Наибольший элемент массива: " + most);
        System.out.println("Наименьший элемент массива: " + less);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Cумму элементов массива, оканчивающихся на 0: " + sum);
    }
}

