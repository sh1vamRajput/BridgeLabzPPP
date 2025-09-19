package OOPS.Class_and_Object.Level1;


class Item {
    private int itemCode;
    private String itemName;
    private double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemInventory {
    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 45000);
        item.displayDetails();
        System.out.println("Total cost for 3 items: " + item.calculateTotalCost(3));
    }
}
