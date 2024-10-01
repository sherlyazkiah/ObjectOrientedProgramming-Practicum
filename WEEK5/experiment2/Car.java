package WEEK5.experiment2;

public class Car {
    private String name;
    private int cost;

    public Car() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public int carCostCalculation(int days) {
        return cost * days;
    }
}
