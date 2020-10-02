package day11;

public class Picker implements Worker {

    private int salary = 0;

    Warehouse picker;

    public Picker(Warehouse w) {
        picker = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        picker.setCountOrders(picker.getCountOrders() + 1);
    }

    @Override
    public int bonus() {
        if (picker.getCountOrders() == 1500)
            salary = getSalary() * 3;
        return salary;
    }

    @Override
    public String toString() {
        return "Заработная плата сборщика: " + getSalary();
    }
}
