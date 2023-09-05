package technology;

public class Laptop extends Computer{
    private final double screenSize;
    public Laptop(String brand, String model, double price, double screenSize) {
        super(brand, model, price);
        this.screenSize = screenSize;

    }

    public boolean carry() {
        return screenSize <= 22.5;
    }


}
