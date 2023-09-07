package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{

    public String dvdName;
    public double storageCapacityDvd;
    public double remainingCapacityDvd;
    public double capacityUsedDvd;


    public DVD(String name, double storageCapacity, double remainingCapacity, double capacityUsed) {
        super(name, storageCapacity, remainingCapacity, capacityUsed);
        this.dvdName = name;
        this.storageCapacityDvd = storageCapacity;
        this.remainingCapacityDvd = remainingCapacity;
        this.capacityUsedDvd = capacityUsed;
    }
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570-1600 rpm");

    }

    @Override
    public void readData() {
        System.out.println("This DVD " + dvdName +" is " + storageCapacityDvd + "GB. With " + remainingCapacityDvd + "GB left after " +capacityUsedDvd + "GB were used");
    }

    @Override
    public void destroyMicrowave() {
        System.out.println(dvdName + " destroyed the microwave");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
