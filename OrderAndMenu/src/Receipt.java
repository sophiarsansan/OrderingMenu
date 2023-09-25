import java.util.List;

public class Receipt {
    public static void printReceipt(List<OrderItem> orderItems, double totalBill) {
        System.out.println("\n~~ ALBERTO'S KARINDERYA ~~");
        System.out.println("================================");
        System.out.println("Name of Order  |  Quantity  |  Value");
        System.out.println("--------------------------------");

        for (OrderItem item : orderItems) {
            System.out.printf("%-15s | %10d | ₱%7.2f%n", item.getName(), item.getQuantity(), item.getValue());
        }

        System.out.println("--------------------------------");
        System.out.printf("Total bill: ₱%.2f%n", totalBill);
        System.out.println("================================");
    }
}