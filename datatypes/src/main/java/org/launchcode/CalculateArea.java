package org.launchcode;
import java.util.Scanner;
public class CalculateArea {
    public static void main(String[] args) {
        Scanner inputLength = new Scanner (System.in);
        System.out.println("Please enter the length of the rectangle");

        Double length = inputLength.nextDouble();

        Scanner inputWidth = new Scanner (System.in);
        System.out.println("Please enter the width of the rectangle");

        Double width = inputWidth.nextDouble();

        System.out.println("The area of the rectangle is: " + length * width);

    }
}
