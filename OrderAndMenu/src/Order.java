

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        // Create a Menu object to manage the menu items
        Menu menu = new Menu();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for the total bill
        double totalBill = 0.0;

        // Display the menu
        menu.displayMenu();

        // Ask the user for orders
        while (true) {
            System.out.print("\nEnter an item number (or '0' to finish ordering): ");
            String input = scanner.nextLine().trim();

            // Check if the user is done ordering
            if (input.equalsIgnoreCase("0")) {
                break;
            }

            try {
                int itemNumber = Integer.parseInt(input);

                // Check if the entered item number is in the menu
                if (menu.containsItem(itemNumber)) {
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    // Calculate the cost of the order and add it to the total bill
                    double orderCost = menu.getPrice(itemNumber) * quantity;
                    totalBill += orderCost;

                    System.out.println(
                            "Added " + quantity + " " + menu.getItemName(itemNumber) + "(s) to your order. Cost: ₱"
                                    + orderCost);
                } else {
                    System.out.println("Invalid item number. Please choose from the menu.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid item number or '0' to finish ordering.");
            }
        }

        // Display the total bill
        System.out.println("Your total bill is: ₱" + totalBill);

        // Close the scanner
        scanner.close();
    }
}
