

public class OrderItem {
    private String name;
    private int quantity;
    private double value;

    public OrderItem(String name, int quantity, double value) {
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getValue() {
        return value;
    }
}
