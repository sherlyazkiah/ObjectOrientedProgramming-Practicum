package WEEK5.assignment;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private Category category;

    public Product(String productId, String productName, double price, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public String info() {
        return "Product ID: " + productId + "\nProduct Name: " + productName + "\nPrice: " + price + "\nCategory: " + category.getCategoryName() + "\n";
    }
}
