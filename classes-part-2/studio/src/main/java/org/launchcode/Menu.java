package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private static Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

//    public static int hash(double price, String description, String category) {
//    }

    public static void removeItem(Menu apps) {
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }







    public static boolean addItem(MenuItem newItem, ArrayList<MenuItem> appetizers, ArrayList<MenuItem> mainCourses, ArrayList<MenuItem> desserts) {
        if (!appetizers.contains(newItem) && !mainCourses.contains(newItem) && !desserts.contains(newItem)) {
            switch (newItem.getCategory()) {
                case "Appetizer":
                    appetizers.add(newItem);
                    break;

                case "Main Course":
                    mainCourses.add(newItem);
                    break;

                case "Dessert":
                    desserts.add(newItem);
                    break;
                default:
                    return false;
            }
            lastUpdated = new Date();
            return true;
        }
        return false;
    }

    public static boolean removeItem(Menu itemToRemove, ArrayList<MenuItem> appetizers, ArrayList<MenuItem> mainCourses, ArrayList<MenuItem> desserts) {
        boolean removed = false;
        if(appetizers.remove(itemToRemove) || mainCourses.remove(itemToRemove) || desserts.remove(itemToRemove)) {
            removed = true;
            lastUpdated = new Date();
        }
        return removed;
    }


    public static void printMenuItem(Menu item) {
        System.out.println(item);
    }


}



