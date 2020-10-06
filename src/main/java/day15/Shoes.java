package day15;

public class Shoes {
    private String name;
    private int size;
    private int quantity;

    public Shoes(String name, int size, int quantity) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Наименование: '" + name +
                " | размер: " + size +
                " | количество: " + quantity;
    }
}
