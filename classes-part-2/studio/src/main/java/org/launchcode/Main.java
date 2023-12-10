package org.launchcode;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Samosa","stuffed savory pastry", 2.25, "appetizer");
        MenuItem item2 = new MenuItem("Chicen 65","soft and juicy chicken", 9.75, "appetizer");
        MenuItem item3 = new MenuItem( "Briyani","Aromatic chicken rice", 13.99, "main course");
        MenuItem item4 = new MenuItem("Butter masala","Creamy chicken masala", 12.99,"main course");
        MenuItem item5 = new MenuItem("Jamun","sweet balls", 1.25, "dessert");

        //System.out.println(item1.isNew());
        System.out.println(item3);
        // write your code here
    }
}
