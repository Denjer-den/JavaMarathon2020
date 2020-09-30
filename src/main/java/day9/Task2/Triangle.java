package day9.Task2;

public class Triangle extends Figure {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.color = color;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double area() {
        return Math.sqrt(perimeter() / 2 * ((perimeter() / 2 - side1)) * (perimeter() / 2 - side2) * (perimeter() / 2 - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
