package day6;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Boeing", 2000, 100, 70);
        plane.setYear(1000);
        plane.setLength(124);
        System.out.println(plane.fillUp(20));
        System.out.println(plane.fillUp(33));
        plane.info();
    }
}
