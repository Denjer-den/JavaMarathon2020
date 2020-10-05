package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println(parseFileToObjList());
    }

    public static List<Person> parseFileToObjList() {
        File file = new File("people.txt");
        List<Person> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("-")) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        break;
                    }
                }
                String[] numb = line.split(" ");

                list.add(new Person(numb[0], Integer.parseInt(numb[1])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return list;
    }
}
