package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public String cdName;
    public double storageCapacityCd;
    public double remainingCapacityCd;
    public double capacityUsedCd;
    public CD(String name, double storageCapacity, double remainingCapacity, double capacityUsed) {
        super(name, storageCapacity, remainingCapacity, capacityUsed);

        this.cdName = name;
        this.storageCapacityCd = storageCapacity;
        this.remainingCapacityCd = remainingCapacity;
        this.capacityUsedCd = capacityUsed;
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200-500 rpm");
    }

    @Override
    public void readData() {
        System.out.println("This DVD " + cdName +" is " + storageCapacityCd + "GB. With " + remainingCapacityCd + "GB left after " + capacityUsedCd + "GB were used");

    }

    @Override
    public void destroyMicrowave() {
        System.out.println(cdName + " destroyed the microwave");

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
