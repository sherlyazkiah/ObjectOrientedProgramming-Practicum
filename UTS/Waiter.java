package UTS;

class Waiter extends Employee {
    public Waiter(String name, int skillLevel) {
        super(name, "Waiter", skillLevel);
    }

    public void serve(Customer customer, Food food) {
        System.out.println(getName() + " is serving " + food.getName() + " to " + customer.getName());
    }
}
