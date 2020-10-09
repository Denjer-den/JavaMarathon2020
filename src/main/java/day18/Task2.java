package day18;

/**
 * @author Neil Alishev
 */
public class Task2 {

    public static void main(String[] args) {

        System.out.println(count7(717771237));
    }

    public static int count7(int i) {

        if (i % 10 == 7)
            return 1 + count7(i / 10);

        if (String.valueOf(Math.abs(i)).length() == 1)
            return 0;

        return count7(i / 10);
    }
}
