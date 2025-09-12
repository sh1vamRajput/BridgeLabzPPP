package OOPS.This_Static_Final_Instance_of_Operator;

// Shopping Cart System demonstrating static, this, final, and instanceof
class Product {
    static double discount = 5.0;  // Shared discount for all products
    final String productID;
    String productName;
    double price;
    int quantity;

    Product(String productName, String productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", "P1001", 55000, 2);
        if (p1 instanceof Product) {
            Product.updateDiscount(10.0);
            p1.displayDetails();
        }
    }
}

