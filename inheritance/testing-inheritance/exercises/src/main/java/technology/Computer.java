package technology;

public class Computer extends AbstractEntity {

    // 3 props, 2 methods & 1 constructor
    private String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void start() {

    }

    public void shutDown() {

    }
}
