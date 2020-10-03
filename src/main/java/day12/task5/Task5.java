package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist musicArtist1 = new MusicArtist("Майк Шинода", 43);
        MusicArtist musicArtist2 = new MusicArtist("Дэйв Фаррелл", 43);
        MusicArtist musicArtist3 = new MusicArtist("Брэд Делсон", 42);
        MusicArtist musicArtist4 = new MusicArtist("Райан Теддер", 41);
        MusicArtist musicArtist5 = new MusicArtist("Эдди Фишер", 46);
        MusicArtist musicArtist6 = new MusicArtist("Зак Филкинс", 42);

        List<MusicArtist> listA = new ArrayList<>(Arrays.asList(musicArtist1, musicArtist2, musicArtist3));
        List<MusicArtist> listB = new ArrayList<>(Arrays.asList(musicArtist4, musicArtist5, musicArtist6));

        MusicBand musicBand1 = new MusicBand("Linkin Park", 2000, listA);
        MusicBand musicBand2 = new MusicBand("One Republic", 2003, listB);
        MusicBand.printMembers(musicBand1);
        MusicBand.transferMembers(musicBand1, musicBand2);

        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);
    }
}
