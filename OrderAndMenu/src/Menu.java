

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<Integer, MenuItem> menuItems;

    public Menu() {
        menuItems = new HashMap<>();
        initializeMenu();
    }

    private void initializeMenu() {
        menuItems.put(1, new MenuItem("Mechado", 75.00));
        menuItems.put(2, new MenuItem("Spaghetti", 50.00));
        menuItems.put(3, new MenuItem("Chicken", 80.00));
        menuItems.put(4, new MenuItem("Caldereta", 75.00));
        menuItems.put(5, new MenuItem("Hotdog", 30.00));
        menuItems.put(6, new MenuItem("Tocino", 35.00));
        menuItems.put(7, new MenuItem("Ginataan", 40.00));
        menuItems.put(8, new MenuItem("Coke", 80.00));
        menuItems.put(9, new MenuItem("Water", 10.00));
        menuItems.put(10, new MenuItem("Icetea", 15.00));
        menuItems.put(11, new MenuItem("Rice", 25.00));
    }

    public double getPrice(int itemNumber) {
        MenuItem menuItem = menuItems.get(itemNumber);
        return menuItem != null ? menuItem.getPrice() : 0.0;
    }

    public boolean containsItem(int itemNumber) {
        return menuItems.containsKey(itemNumber);
    }

    public String getItemName(int itemNumber) {
        MenuItem menuItem = menuItems.get(itemNumber);
        return menuItem != null ? menuItem.getName() : "";
    }

    public void displayMenu() {
    	System.out.println("~~~WELCOME TO ALBERTO'S KARINDERYA~~~");
        System.out.println("\nMenu for today:");
        for (int itemNumber : menuItems.keySet()) {
            MenuItem menuItem = menuItems.get(itemNumber);
            System.out.println("["+itemNumber + "] " + menuItem.getName() + " - ₱" + menuItem.getPrice());
        }
    }

    private class MenuItem {
        private String name;
        private double price;

        public MenuItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
