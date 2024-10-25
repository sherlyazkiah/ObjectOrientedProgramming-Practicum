package WEEK8;

import java.util.*;

class Food {
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
}

class Customer {
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

class Employee {
    private String name;
    private String role;
    private int skillLevel;

    public Employee(String name, String role, int skillLevel) {
        this.name = name;
        this.role = role;
        this.skillLevel = skillLevel;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getSkillLevel() {
        return skillLevel;
    }
}

class Restaurant {
    private double money;
    private int burgerStock;
    private int friesStock;
    private int drinkStock;
    private int reputation;
    Queue<Customer> customerQueue;

    public Restaurant(double money, int burgerStock, int friesStock, int drinkStock, int reputation) {
        this.money = money;
        this.burgerStock = burgerStock;
        this.friesStock = friesStock;
        this.drinkStock = drinkStock;
        this.reputation = reputation;
        this.customerQueue = new LinkedList<>();
    }

    public void addCustomerToQueue(Customer customer) {
        customerQueue.add(customer);
        System.out.println("Customer " + customer.getName() + " arrives with an order: " + customer.getPreferredFood().getName());
    }

    public void manageStock(int burgerAmount, int friesAmount, int drinkAmount) {
        burgerStock += burgerAmount;
        friesStock += friesAmount;
        drinkStock += drinkAmount;
        System.out.println("Current stock: burger (" + burgerStock + "), fries (" + friesStock + "), drinks (" + drinkStock + ")");
    }

    public void cookFood(Food food) {
        if (food.getName().equals("Burger") && burgerStock > 0) {
            burgerStock--;
            System.out.println("Cooking " + food.getName() + "... (Time: " + food.getCookingTime() + " seconds)");
            try {
                Thread.sleep(food.getCookingTime() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(food.getName() + " has been cooked.");
        } else if (food.getName().equals("Fries") && friesStock > 0) {
            friesStock--;
            System.out.println("Cooking " + food.getName() + "... (Time: " + food.getCookingTime() + " seconds)");
            try {
                Thread.sleep(food.getCookingTime() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(food.getName() + " has been cooked.");
        } else if (food.getName().equals("Drink") && drinkStock > 0) {
            drinkStock--;
            System.out.println("Making " + food.getName() + "... (Time: " + food.getCookingTime() + " seconds)");
            try {
                Thread.sleep(food.getCookingTime() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(food.getName() + " has been made.");
        } else {
            System.out.println("Out of stock, cannot cook!");
        }
    }

    public void serveCustomer() {
        if (!customerQueue.isEmpty()) {
            Customer customer = customerQueue.poll();
            System.out.println("Serving customer: " + customer.getName());
            System.out.println("Initial patience: " + customer.getPatience() + " seconds");

            // Cooking process
            if (burgerStock == 0 && customer.getPreferredFood().getName().equals("Burger")) {
                System.out.println("Out of stock!\n" + customer.getName() + " left the restaurant.");
                reputation -= 1;
                System.out.println("Reputation decreased.");
                return;
            } else if (friesStock == 0 && customer.getPreferredFood().getName().equals("Fries")) {
                System.out.println("Out of stock!\n" + customer.getName() + " left the restaurant.");
                reputation -= 1;
                System.out.println("Reputation decreased.");
                return;
            } else if (drinkStock == 0 && customer.getPreferredFood().getName().equals("Drink")) {
                System.out.println("Out of stock!\n" + customer.getName() + " left the restaurant.");
                reputation -= 1;
                System.out.println("Reputation decreased.");
                return;
            }

            cookFood(customer.getPreferredFood());

            // Serve the order
            System.out.println("Order " + customer.getPreferredFood().getName() + " has been served to " + customer.getName());

            // Payment
            money += customer.getPreferredFood().getPrice();
            System.out.println(customer.getName() + " has paid Rp. " + customer.getPreferredFood().getPrice());

            // Display remaining patience
            int remainingPatience = customer.getPatience() - customer.getPreferredFood().getCookingTime();
            System.out.println("Remaining patience: " + remainingPatience + " seconds");

            // Measure customer satisfaction
            measureCustomerSatisfaction(customer);
        } else {
            System.out.println("No customers in the queue.");
        }
    }

    public void measureCustomerSatisfaction(Customer customer) {
        if (customer.isAngry()) {
            reputation -= 10;
            System.out.println("Customer " + customer.getName() + " is angry! Reputation decreased.");
        } else {
            reputation += 5;
            System.out.println("Customer " + customer.getName() + " is satisfied! Reputation increased.");
        }
    }

    public void displayStatus() {
        System.out.println("Total money: " + money + " | Stock: burger (" + burgerStock + "), fries (" + friesStock + "), drinks (" + drinkStock + ") | Reputation: " + reputation);
    }
}

public class RestaurantSimulation {
    public static void main(String[] args) {
        // Display initial restaurant information
        System.out.println("--------------------------------------------------------");
        System.out.println("               WELCOME TO THE RESTAURANT               ");
        System.out.println("--------------------------------------------------------");
        Restaurant restaurant = new Restaurant(0, 2, 3, 2, 60);  // Initial money 0, burger stock 2, fries stock 3, drink stock 2, reputation 60
        restaurant.manageStock(0, 0, 0); // Display stock

        Random random = new Random();
        String[] customerNames = {"Ali", "Budi", "Citra", "Dedi", "Eka"};

        // List of available food
        Food burger = new Food("Burger", 45000, Arrays.asList("Bun", "Meat", "Lettuce"), 2);
        Food fries = new Food("Fries", 20000, Arrays.asList("Potatoes", "Salt"), 1);
        Food drink = new Food("Drink", 10000, Arrays.asList("Water", "Syrup"), 1);
        List<Food> menu = Arrays.asList(burger, fries, drink);

        // Simulate random customer arrivals
        for (int i = 0; i < 7; i++) {  // 7 customers for example
            int patience = random.nextInt(1) + 1;  // Patience between 1-2 seconds

            Customer customer = new Customer(customerNames[random.nextInt(customerNames.length)],
                                             menu.get(random.nextInt(menu.size())),
                                             patience);
            restaurant.addCustomerToQueue(customer);
        }

        // Serve all customers in the queue
        while (!restaurant.customerQueue.isEmpty()) {
            restaurant.serveCustomer();
            System.out.println("--------------------------------------------------------");
        }

        // Display final status
        restaurant.displayStatus();
    }
}
