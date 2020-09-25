package day5;

public class Task1 {
    public static void main(String[] args) {
Car car = new Car();
car.setYear(1999);
car.setModel("Skyline GTR");
car.setColor("Blue");

        System.out.println(car.getYear());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
    }
}
