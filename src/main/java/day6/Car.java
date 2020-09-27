package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public Car(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int difYear) {
        difYear = difYear - year;
        return difYear;
    }
}
