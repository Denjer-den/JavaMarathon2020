package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(2000, "Blue", "Gtr-5");
        Motorbike motorbike = new Motorbike(1988, "Red", "Jovian-5");
        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2020));
        System.out.println(motorbike.yearDifference(2020));
    }
}
