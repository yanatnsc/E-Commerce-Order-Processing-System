public class Order {
    String orderId;
    String customerName;
    String orderDetails;

    // Constructor
    public Order(String orderId, String customerName, String orderDetails) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + customerName + ", Details: " + orderDetails;
    }
}
