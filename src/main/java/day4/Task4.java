package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10001);
        }
        int sum = 0;
        int temp = 0;
        int idx = 0;
        for (int i = 1; i < array.length - 1; i++) {
            sum = array[i - 1] + array[i] + array[i + 1];
            if (sum >= temp) {
                temp = sum;
                idx = i - 1;
            }
        }
        System.out.println(temp);
        System.out.println(idx);
    }
}
