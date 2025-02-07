
class RetailManage {
    public static void main(String[] args) {
        Order order = new Order(101, "2024-02-07");
        System.out.println(order.getOrderStatus());

        ShippedOrder shippedOrder = new ShippedOrder(102, "2024-02-06", "TRK12345");
        System.out.println(shippedOrder.getOrderStatus());

        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2024-02-05", "TRK67890", "2024-02-07");
        System.out.println(deliveredOrder.getOrderStatus());
    }
}

class Order {
    int orderId;
    String orderDate;
    
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    
    String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;
    
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    
    @Override
    String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    
    @Override
    String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

