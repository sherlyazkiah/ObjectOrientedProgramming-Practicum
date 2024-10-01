package WEEK5.assignment;

public class Order {
    private String orderId;
    private Customer customer;
    private Product[] products;
    private int productCount; // To track the number of added products
    private double totalAmount;

    // Constructor with a maximum product capacity
    public Order(String orderId, Customer customer, int maxProducts) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new Product[maxProducts];
        this.productCount = 0;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Cannot add more products. Order is full.");
        }
    }

    public void calculateTotal() {
        totalAmount = 0;
        for (int i = 0; i < productCount; i++) {
            totalAmount += products[i].getPrice();
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String info() {
        String info = "Order ID: " + orderId + "\nCustomer Info:\n" + customer.info() + "Products:\n";
        for (int i = 0; i < productCount; i++) {
            info += products[i].info() + "\n";
        }
        calculateTotal();
        info += "Total Amount: " + totalAmount + "\n";
        return info;
    }
}
