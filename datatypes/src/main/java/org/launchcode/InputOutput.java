package org.launchcode;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner inputMiles = new Scanner(System.in);
        System.out.println("Please enter miles driven");
        Double miles = inputMiles.nextDouble();
        Scanner inputGallons = new Scanner(System.in);
        System.out.println("Please enter gallons used");
        Double gallons = inputGallons.nextDouble();

        System.out.println("Your car runs at an " + miles / gallons + "miles per gallon efficiency");

    }
}
