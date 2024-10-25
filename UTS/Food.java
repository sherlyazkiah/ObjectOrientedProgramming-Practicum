package UTS;

import java.util.List;

public class Food {
    private String name;
    private double price;
    private List<String> ingredients;
    private int cookingTime;

    public Food(String name, double price, List<String> ingredients, int cookingTime) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
