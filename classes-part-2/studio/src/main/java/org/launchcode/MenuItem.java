package org.launchcode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private LocalDate dateAdded;
    //private boolean isNew;


    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
        //this.isNew = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        String newText = isNew() ?  " -NEW!" : "";
        return name  + newText + "\n" + description  + "--$" + price ;
    }

    @Override
    public boolean equals(Object toBeCompared){
        if(this == toBeCompared){
            return true;
        }
        if(toBeCompared == null){
            return false;
        }
        if(getClass() != toBeCompared.getClass()){
            return false;
        }
        MenuItem otherItem =(MenuItem) toBeCompared;
        return this.name.equals(otherItem.getName());

    }


    boolean isNew(){
        LocalDate today = LocalDate.now();
        double daysBtw = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBtw < 90;
    }

}



    /*public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }*/


