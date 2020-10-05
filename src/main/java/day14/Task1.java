package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers");

        List<Integer> list = new ArrayList<>();
        int count = 0;
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numb = line.split(" ");
            for (int i = 0; i < numb.length; i++) {
                list.add(Integer.parseInt(numb[i]));
                sum += list.get(i);
                count++;
                if (i == 9)
                    System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        if (count != 10 && count > 0) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }
        }
    }
}
