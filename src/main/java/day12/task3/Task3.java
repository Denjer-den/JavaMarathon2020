package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> list = new ArrayList<>();

        list.add(new MusicBand("Linkin Park", 2000));
        list.add(new MusicBand("Kasabian", 1997));
        list.add(new MusicBand("Thirty Seconds to Mars", 1998));
        list.add(new MusicBand("Muse", 1994));
        list.add(new MusicBand("Queen5", 1970));
        list.add(new MusicBand("Three Days Grace", 1992));
        list.add(new MusicBand("One Republic", 2003));
        list.add(new MusicBand("Imagine Dragons", 2008));
        list.add(new MusicBand("The Script", 2001));
        list.add(new MusicBand("The Beatles",1960));

        System.out.println(list);
        System.out.println(groupsAfter2000(list));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List <MusicBand> after2000 = new ArrayList<>();
        for (MusicBand band: bands) {
            if (band.getYear() >= 2000){
                after2000.add(band);
            }
        }
        return after2000;
    }
}
