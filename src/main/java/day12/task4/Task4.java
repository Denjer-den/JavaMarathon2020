package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("Майк Шинода", "Дэйв Фаррелл", "Брэд Делсон"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Райан Теддер", "Эдди Фишер", "Зак Филкинс"));

        MusicBand musicBand1 = new MusicBand("Linkin Park", 2000, list1);
        MusicBand musicBand2 = new MusicBand("One Republic", 2003, list2);

        MusicBand.transferMembers(musicBand1, musicBand2);
        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);
    }
}
