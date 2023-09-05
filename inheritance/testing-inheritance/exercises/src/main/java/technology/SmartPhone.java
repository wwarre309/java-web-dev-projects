package technology;

public class SmartPhone extends Computer {
    private String operatingSystem;
    private int storageCapacity;

    public SmartPhone (String brand, String model, double price, String operatingSystem, int storageCapacity) {
        super (brand, model, price);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
    }


    public void makeCall(String phoneNumber) {
        // Logic to make a call based on operatingSystem and storageCapacity
        if (operatingSystem.equals("iOS") && storageCapacity >= 64) {
            System.out.println("Making a call to " + phoneNumber);
        } else {
            System.out.println("Cannot make a call. Insufficient storage or unsupported OS.");
        }
    }
}
