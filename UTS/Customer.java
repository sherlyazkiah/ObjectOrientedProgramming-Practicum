package UTS;

public class Customer {
    private String name;
    private Food preferredFood;
    private int patience;

    public Customer(String name, Food preferredFood, int patience) {
        this.name = name;
        this.preferredFood = preferredFood;
        this.patience = patience;
    }

    public String getName() {
        return name;
    }

    public Food getPreferredFood() {
        return preferredFood;
    }

    public int getPatience() {
        return patience;
    }

    public void decreasePatience() {
        if (patience > 0) {
            patience--;
        }
    }

    public boolean isAngry() {
        return patience <= 0;
    }
}
