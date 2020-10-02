package day11;

public class Courier implements Worker {
    private int salary = 0;

    Warehouse courier;

    public Courier(Warehouse w) {
        courier = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        courier.setBalance(courier.getBalance() + 1000);
    }

    @Override
    public int bonus() {
        if (courier.getBalance() % 1000000 == 0)
            if (courier.getBalance() == 1000000)
                salary = salary * 2;
        return salary;
    }

    @Override
    public String toString() {
        return "Заработная плата курьера: " + getSalary();
    }
}
