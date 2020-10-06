package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("C:/Users/Даниил.LAPTOP-EL0DL15F/Desktop/Repositoty/JavaMarathon2020/src/main/resources/shoes.csv");
        List<Shoes> list = new ArrayList<>();

        Scanner scanner = new Scanner(fileIn);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] str = line.split(";");
            if (Integer.parseInt(str[2]) == 0)
                list.add(new Shoes(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2])));
        }

        File fileOut = new File("C:/Users/Даниил.LAPTOP-EL0DL15F/Desktop/Repositoty/JavaMarathon2020/src/main/resources/missing_shoes.txt");
        PrintWriter pw = new PrintWriter(fileOut);

        for (Shoes sh : list)
            pw.println(sh);
        pw.close();
    }
}
