package WEEK5.assignment;

public class MainOnlineShopping {
    public static void main(String[] args) {
        // Create Categories
        Category electronics = new Category("C001", "Electronics");
        Category clothing = new Category("C002", "Clothing");

        // Create Products
        Product laptop = new Product("P001", "Laptop", 800.00, electronics);
        Product tShirt = new Product("P002", "T-Shirt", 20.00, clothing);

        // Create Customer
        Customer customer = new Customer("C123", "Sara Jean", "sara.jean@gmail.com");

        // Create Order with a capacity of 5 products
        Order order = new Order("O1001", customer, 5);
        order.addProduct(laptop);
        order.addProduct(tShirt);

        // Display Order Information
        System.out.println(order.info());
    }
}
