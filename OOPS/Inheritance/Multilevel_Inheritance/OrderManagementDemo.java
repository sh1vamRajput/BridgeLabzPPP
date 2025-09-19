package OOPS.Inheritance.Multilevel_Inheritance;
// Base class: Order
class Order {
    int orderId;          // Unique ID for the order
    String orderDate;     // Date when the order was placed

    // Constructor for Order
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return the current status
    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

// Subclass: ShippedOrder extends Order
class ShippedOrder extends Order {
    String trackingNumber; // Tracking number for shipment

    // Constructor for ShippedOrder
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call Order's constructor
        this.trackingNumber = trackingNumber;
    }

    // Override getOrderStatus to include shipping info
    @Override
    String getOrderStatus() {
        return "Order shipped. Tracking No: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder extends ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;  // Date when the order was delivered

    // Constructor for DeliveredOrder
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call ShippedOrder's constructor
        this.deliveryDate = deliveryDate;
    }

    // Override getOrderStatus to include delivery info
    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

// Test class
public class OrderManagementDemo {
    public static void main(String[] args) {
        Order o = new Order(101, "2025-09-15");
        ShippedOrder so = new ShippedOrder(102, "2025-09-16", "TN12345");
        DeliveredOrder d = new DeliveredOrder(103, "2025-09-17", "TN54321", "2025-09-19");

        System.out.println(o.getOrderStatus());   // From Order
        System.out.println(so.getOrderStatus());  // From ShippedOrder
        System.out.println(d.getOrderStatus());   // From DeliveredOrder
    }
}


