package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrice = new int[12][8];
        int sum = 0;
        int var = 0;
        int count = 0;
        Random rand = new Random();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (j == 0) {
                    sum = 0;
                }
                matrice[i][j] = rand.nextInt(51);
                sum += matrice[i][j];
            }
            if (var <= sum) {
                var = sum;
                count = i;
            }
        }
        System.out.println("Индекс строки - " + count + ", сумма строки: " + var);
    }
}
