package UTS;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Restaurant {
    private double money;
    private int burgerStock;
    private int friesStock;
    private int drinkStock;
    private int reputation;
    Queue<Customer> customerQueue;
    private Chef chef;
    private Waiter waiter;
    private Cleaner cleaner;
    private List<Food> menu;

    public Restaurant(double money, int burgerStock, int friesStock, int drinkStock, int reputation, Chef chef, Waiter waiter, Cleaner cleaner, List<Food> menu) {
        this.money = money;
        this.burgerStock = burgerStock;
        this.friesStock = friesStock;
        this.drinkStock = drinkStock;
        this.reputation = reputation;
        this.customerQueue = new LinkedList<>();
        this.chef = chef;
        this.waiter = waiter;
        this.cleaner = cleaner;
        this.menu = menu;
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
        } else if (food.getName().equals("Fries") && friesStock > 0) {
            friesStock--;
        } else if (food.getName().equals("Drink") && drinkStock > 0) {
            drinkStock--;
        } else {
            System.out.println("Out of stock, cannot cook!");
            return;
        }

        System.out.println(chef.getName() + " is cooking " + food.getName() + "...");
        try {
            Thread.sleep(food.getCookingTime() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(food.getName() + " has been cooked by " + chef.getName());
    }

    public void serveCustomer() {
        if (!customerQueue.isEmpty()) {
            Customer customer = customerQueue.poll();
            System.out.println("Serving customer " + customer.getName());
            System.out.println("Initial patience: " + customer.getPatience() + " seconds");
    
            // Cooking process
            Food foodToCook = customer.getPreferredFood();
    
            // Check if the food is available in stock before cooking
            if (foodToCook.getName().equals("Burger") && burgerStock > 0) {
                cookFood(foodToCook); // Decrease stock
            } else if (foodToCook.getName().equals("Fries") && friesStock > 0) {
                cookFood(foodToCook); // Decrease stock
            } else if (foodToCook.getName().equals("Drink") && drinkStock > 0) {
                cookFood(foodToCook); // Decrease stock
            } else {
                System.out.println("Out of stock, cannot serve " + foodToCook.getName() + "!");
                return;
            }
    
            // Serve the order
            waiter.serve(customer, foodToCook);
    
            // Payment
            money += foodToCook.getPrice();
            System.out.println(customer.getName() + " has paid Rp. " + foodToCook.getPrice());
    
            // Display remaining patience
            int remainingPatience = customer.getPatience() - foodToCook.getCookingTime();
            System.out.println("Remaining patience: " + remainingPatience + " seconds");
    
            // Measure customer satisfaction
            if (remainingPatience < 0) {
                System.out.println("Customer " + customer.getName() + " is running out of patience! Reputation decreased.");
                reputation -= 5; // Decrease reputation for running out of patience
            } else {
                System.out.println("Customer " + customer.getName() + " is satisfied! Reputation increased.");
                reputation += 10; // Increase reputation for satisfaction
            }
            
            // Cleaning table by Cleaner
            cleaner.cleanTable();
        } else {
            System.out.println("No customers in the queue.");
        }
    }    

    public void checkInventory() {
        System.out.println("--------------------------------------------------------");
        System.out.println("|   Food   | Stock |    Price     |    Ingredients    |");
        System.out.println("--------------------------------------------------------");

        for (Food food : menu) {
            int stock = 0;
            if (food.getName().equalsIgnoreCase("Burger")) {
                stock = burgerStock;
            } else if (food.getName().equalsIgnoreCase("Fries")) {
                stock = friesStock;
            } else if (food.getName().equalsIgnoreCase("Drink")) {
                stock = drinkStock;
            }

            System.out.printf("| %-8s | %-5d | Rp. %-8.2f | %-15s |\n", food.getName(), stock, food.getPrice(), food.getIngredients());
        }
        System.out.println("--------------------------------------------------------");
    }
    
    public void addStock(String foodType, int amount) {
        switch (foodType.toLowerCase()) {
            case "burger":
                burgerStock += amount;
                System.out.println(amount + " burgers added to stock. Current burger stock: " + burgerStock);
                break;
            case "fries":
                friesStock += amount;
                System.out.println(amount + " fries added to stock. Current fries stock: " + friesStock);
                break;
            case "drink":
                drinkStock += amount;
                System.out.println(amount + " drinks added to stock. Current drink stock: " + drinkStock);
                break;
            default:
                System.out.println("Invalid food type. Please enter 'burger', 'fries', or 'drink'.");
                break;
        }
    }
    
    public void viewQueue() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in the queue.");
        } else {
            System.out.println("----------------------------------------");
            System.out.println("|   Name   |    Order    |   Patience  |");
            System.out.println("----------------------------------------");
    
            for (Customer customer : customerQueue) {
                String foodName = customer.getPreferredFood().getName();
                int patience = customer.getPatience();
    
                System.out.printf("| %-8s | %-11s | %-1d seconds   |\n", customer.getName(), foodName, patience);
            }
    
            System.out.println("----------------------------------------");
        }
    }    
    
    public void displayStatus() {
        System.out.println("Balance: " + money + "\nReputation: " + reputation);
    }
}
