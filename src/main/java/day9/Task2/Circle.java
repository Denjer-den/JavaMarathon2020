package day9.Task2;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
