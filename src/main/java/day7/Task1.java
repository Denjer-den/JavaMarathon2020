package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boeing", 2000, 100, 70);
        Airplane a2 = new Airplane("Airbus", 2005, 170, 90);
        Airplane.compareAirplanes(a1, a2);
    }
}