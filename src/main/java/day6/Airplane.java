package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int quantityFuel = 0;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void info(){
        System.out.println("Изготовитель:" + manufacturer + ", год выпуска:" + year + ", длина:" + length + ", вес:" + weight);
    }

    public int fillUp(int quantityFuel){
        this.quantityFuel += quantityFuel;
        return this.quantityFuel;
    }

}
