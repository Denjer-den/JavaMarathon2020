package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mazda");
        list.add("BMW");
        list.add("Mercedes");
        list.add("Audi");
        list.add("Jeep");
        System.out.println(list);

        list.add(Math.round(list.size() / 2), "Toyota");
        list.remove(0);
        System.out.println(list);
    }
}
