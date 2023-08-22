package org.launchcode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner inputRadius = new Scanner(System.in);
        double radius = 0;

        while (true) {
            System.out.print("Enter a radius: ");
            try {
                radius = inputRadius.nextDouble();

                if (radius < 0) {
                    System.out.println("Error: Radius cannot be negative. Please try again.");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                inputRadius.nextLine();
            }
        }

        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        inputRadius.close();
    }
}