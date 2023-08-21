package org.launchcode;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
//package org.launchcode;
//
//public class HelloMethods {
//
//    public static void main(String[] args) {
//        String message = Message.getMessage("fr");
//        System.out.println(message);
//    }
//
//}