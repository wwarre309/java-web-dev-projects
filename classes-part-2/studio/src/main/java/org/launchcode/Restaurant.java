package org.launchcode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
public class Restaurant {

    public static void main(String[] args) {
        // write your code here


        MenuItem spinachDip = new MenuItem(7.99, "Spinach Dip", "Appetizer", true);
        MenuItem calamari = new MenuItem(15.99, "Calamari", "Appetizer", true);
        MenuItem nachos = new MenuItem(11.99, "Nachos", "Appetizer", false);
        ArrayList<MenuItem> appetizers = new ArrayList<>(Arrays.asList(spinachDip, calamari, nachos));
        Menu apps = new Menu(new Date(), appetizers);

        MenuItem grilledSalmon = new MenuItem(19.99, "Grilled Salmon", "Main Course", false);
        MenuItem oxtail = new MenuItem(32.99, "Oxtail", "Main Course", true);
        MenuItem wings = new MenuItem(14.99, "Wings", "Main Course", false);
        ArrayList<MenuItem> mainCourses = new ArrayList<>(Arrays.asList(grilledSalmon, oxtail, wings));
        Menu mains = new Menu(new Date(), mainCourses);

        MenuItem cheesecake = new MenuItem(5.99, "Cheesecake", "Dessert", false);
        MenuItem tresLeches = new MenuItem(9.99, "Tres Leches", "Dessert", true);
        MenuItem shortcake = new MenuItem(5.99, "Strawberry Shortcake", "Dessert", false);
        ArrayList<MenuItem> desserts = new ArrayList<>(Arrays.asList(cheesecake, tresLeches, shortcake));
        Menu dessert1 = new Menu(new Date(), desserts);

        printMenu(apps.getItems(), mains.getItems(), dessert1.getItems());

    }

    public static void printMenu(ArrayList<MenuItem> apps, ArrayList<MenuItem> mainCourses, ArrayList<MenuItem> desserts ) {
        System.out.println("Appetizers:");
        for (MenuItem item : apps) {
            System.out.println(item);
        }
        System.out.println("Main Courses:");
        for (MenuItem item : mainCourses) {
            System.out.println(item);
        }
        System.out.println("Desserts");
        for (MenuItem item : desserts) {
            System.out.println(item);
        }

    }
}
