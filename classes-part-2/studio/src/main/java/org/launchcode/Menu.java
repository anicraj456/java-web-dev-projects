package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
       return "\n Ani menu \n" +
               "APPETIZERS" + appetizers.toString() + "\n" +
               "MAIN COURSE" + mainCourses.toString() + "\n" +
               "DESSERTS" + desserts.toString() + "\n";
    }

    void addItem(MenuItem newItem){
        String message = "This item already added to the menu.";
        if(menuItems.contains(newItem)){
            System.out.println(message);
            return;
        }
        for(MenuItem item : menuItems){
            if(item.equals(menuItems)) {
                System.out.println(message);
            }
        }
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }
    void removeItem(MenuItem item){
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}


