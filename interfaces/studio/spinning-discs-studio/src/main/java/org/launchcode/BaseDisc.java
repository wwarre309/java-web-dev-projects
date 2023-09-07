package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {

   private String name;
   private double storageCapacity;

    private double remainingCapacity;
    private double capacityUsed;

    private String diskType;
    private ArrayList<String> contents;

   public BaseDisc(String name, double storageCapacity, double remainingCapacity, double capacityUsed) {
      this.name = name;
      this.storageCapacity = storageCapacity;
      this.remainingCapacity = remainingCapacity;
      this.capacityUsed = capacityUsed;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getRemainingCapacity() {
        return remainingCapacity;
    }

    public void setRemainingCapacity(double remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
    }

    public double getCapacityUsed() {
        return capacityUsed;
    }

    public void setCapacityUsed(double capacityUsed) {
        this.capacityUsed = capacityUsed;
    }


}
