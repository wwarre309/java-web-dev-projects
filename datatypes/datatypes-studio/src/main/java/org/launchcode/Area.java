package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner inputRadius = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = inputRadius.nextDouble();

        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        inputRadius.close();
    }
}
