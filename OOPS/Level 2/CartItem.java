class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate cost
    double getCost() {
        return price * quantity;
    }

    // Display item details
    void displayItem() {
        System.out.println(itemName + " | Price: " + price + " | Quantity: " + quantity + " | Total: " + getCost());
    }

    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 50000, 1);
        CartItem item2 = new CartItem("Headphones", 2000, 2);

        item1.displayItem();
        item2.displayItem();

        double totalCost = item1.getCost() + item2.getCost();
        System.out.println("Total Cart Cost: " + totalCost);
    }
}