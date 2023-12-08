import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private  ArrayList<MenuItem> menuItem = new ArrayList<>();
    public ArrayList<MenuItem> getMenuItem() {
        return menuItem;
    }
    private LocalDate lastUpdated;

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
