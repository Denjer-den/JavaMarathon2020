package day8;

public class Task1 {
    public static void main(String[] args) {
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 2000; i++) {
            s = s + i + " ";
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
        System.out.println(s);

        StringBuilder str = new StringBuilder();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i <= 2000; i++) {
            str.append(i + " ");
        }
        System.out.println(str);
        long finish2 = System.currentTimeMillis();
        System.out.println(finish2 - start2);

    }
}
