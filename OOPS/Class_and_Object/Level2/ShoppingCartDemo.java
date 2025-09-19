package OOPS.Class_and_Object.Level2;
import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        System.out.println("Total cost: " + total);
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Laptop", 45000, 1));
        cart.addItem(new CartItem("Mouse", 500, 2));
        cart.displayTotalCost();
        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}
