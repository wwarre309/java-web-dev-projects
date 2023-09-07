package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        DVD myDvd = new DVD("Step Brothers", 15.5, 8, 7.5);
        CD myCd = new CD("The Black Album", 4, 2, 2);

        myDvd.spinDisc();
        myDvd.readData();
        myDvd.destroyMicrowave();

        myCd.spinDisc();
        myCd.readData();
        myCd.destroyMicrowave();
    }
}