package UTS;

import java.util.*;

public class RestaurantSimulation {
    public static void main(String[] args) {
        // Display initial restaurant information
        System.out.println("--------------------------------------------------------");
        System.out.println("               WELCOME TO THE RESTAURANT               ");
        System.out.println("--------------------------------------------------------");

        Chef chef = new Chef("Chef John", 5);
        Waiter waiter = new Waiter("Waiter Mike", 5);
        Cleaner cleaner = new Cleaner("Cleaner Sue", 3); 

        // List of available food
        Food burger = new Food("Burger", 45000, Arrays.asList("Bun", "Meat", "Lettuce"), 2);
        Food fries = new Food("Fries", 20000, Arrays.asList("Potatoes", "Salt"), 1);
        Food drink = new Food("Drink", 10000, Arrays.asList("Water", "Syrup"), 1);
        List<Food> menu = Arrays.asList(burger, fries, drink);

        Restaurant restaurant = new Restaurant(0, 2, 3, 2, 0, chef, waiter, cleaner, menu);

        Random random = new Random();
        String[] customerNames = {"Ali", "Budi", "Citra", "Dedi", "Eka", "Tania", "Dean"};

        // Simulate random customer arrivals
        for (int i = 0; i < 7; i++) {  // 7 customers for example
            int patience = random.nextInt(4) + 1;  // Patience between 1-5 seconds

            Customer customer = new Customer(customerNames[random.nextInt(customerNames.length)],
                                             menu.get(random.nextInt(menu.size())),
                                             patience);
            restaurant.addCustomerToQueue(customer);
        }

        // Serve all customers in the queue
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Menu:");
            System.out.println("1. Check Inventory");
            System.out.println("2. Add Stock");
            System.out.println("3. Serve Customer");
            System.out.println("4. View Queue");
            System.out.println("5. View Status");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            command = scanner.nextLine();
            System.out.println("--------------------------------------------------------");

            switch (command) {
                case "1":
                    restaurant.checkInventory();
                    break;
                case "2":
                    System.out.print("Enter food type (burger, fries, drink): ");
                    String foodType = scanner.nextLine();
                    System.out.print("Enter amount to add: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    restaurant.addStock(foodType, amount);
                    break;
                case "3":
                    restaurant.serveCustomer();
                    break;
                case "4":
                    restaurant.viewQueue();
                    break;
                case "5":
                    restaurant.displayStatus();
                    break;
                case "6":
                    System.out.println("Thank you for coming to the restaurant! ^_^");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }

            System.out.println("--------------------------------------------------------");
        } while (!command.equals("6"));

        System.out.println("--------------------------------------------------------");
        System.out.println("               END OF SIMULATION                        ");
        System.out.println("--------------------------------------------------------");
        scanner.close();
    }
}
